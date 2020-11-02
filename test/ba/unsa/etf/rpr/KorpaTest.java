package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {



    @Test
    void dodajArtikl() {
        Artikl artikl1 = new Artikl("Burek", 30, "burek123");
        Artikl artikl2 = new Artikl("Sirnica", 20, "sirnica123");
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(artikl1);
        korpa.dodajArtikl(artikl2);
        Artikl [] artikli = korpa.getArtikli();

        assertEquals("Burek", artikli[0].getNaziv());
        assertEquals("Sirnica", artikli[1].getNaziv());
        assertEquals(30, artikli[0].getCijena());
        assertEquals(20, artikli[1].getCijena());
        assertEquals("burek123",artikli[0].getKod());
        assertEquals("sirnica123", artikli[1].getKod());

    }

    @Test
    void getArtikli() {
        Artikl artikl1 = new Artikl("Mlijeko", 30, "burek123");
        Artikl artikl2 = new Artikl("Puter", 20, "sirnica123");
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(artikl1);
        korpa.dodajArtikl(artikl2);
        Artikl [] artikli = korpa.getArtikli();

        assertEquals("Mlijeko", artikli[0].getNaziv());
        assertEquals("Puter", artikli[1].getNaziv());
        //Artikl [] artikli2 = korpa.getArtikli();


    }



    @Test
    void izbaciArtiklSaKodom() {
        Artikl artikl1 = new Artikl("Mlijeko", 30, "burek123");
        Artikl artikl2 = new Artikl("Puter", 20, "sirnica123");
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(artikl1);
        korpa.dodajArtikl(artikl2);
        assertEquals(2,korpa.getBrojArtikala());
        korpa.izbaciArtiklSaKodom("burek123");
        assertEquals(1, korpa.getBrojArtikala());

    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Artikl artikl1 = new Artikl("Mlijeko", 30, "burek123");
        Artikl artikl2 = new Artikl("Puter", 20, "sirnica123");
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(artikl1);
        korpa.dodajArtikl(artikl2);
        int ukupnaCijena = korpa.dajUkupnuCijenuArtikala();
        assertEquals(50, ukupnaCijena);

    }
}
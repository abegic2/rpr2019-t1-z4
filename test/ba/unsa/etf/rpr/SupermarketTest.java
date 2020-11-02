package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void getArtikli() {
        Artikl artikl1 = new Artikl("Jogurt", 36, "jogurt123");
        Artikl artikl2 = new Artikl("Sok", 12, "sok123");
        Artikl artikl3 = new Artikl("Caj", 5, "caj123");
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(artikl1);
        supermarket.dodajArtikl(artikl2);
        supermarket.dodajArtikl(artikl3);
        assertEquals(3, supermarket.getBrojArtikala());
    }


    @Test
    void dodajArtikl() {
        Supermarket supermarket = new Supermarket();
        assertEquals(0, supermarket.getBrojArtikala());
        Artikl artikl1 = new Artikl("Jogurt", 36, "jogurt123");
        Artikl artikl2 = new Artikl("Kola", 12, "kola123");
        supermarket.dodajArtikl(artikl1);
        supermarket.dodajArtikl(artikl2);
        assertEquals(2, supermarket.getBrojArtikala());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Artikl artikl1 = new Artikl("Jogurt", 36, "jogurt123");
        Artikl artikl2 = new Artikl("Sok", 12, "sok123");
        Artikl artikl3 = new Artikl("Caj", 5, "caj123");
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(artikl1);
        supermarket.dodajArtikl(artikl2);
        supermarket.dodajArtikl(artikl3);
        assertEquals(3, supermarket.getBrojArtikala());
        supermarket.izbaciArtiklSaKodom("sok123");
        assertEquals(2, supermarket.getBrojArtikala());


    }
}
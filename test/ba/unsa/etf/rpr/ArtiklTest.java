package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl artikl = new Artikl("Hljeb", 15, "hljeb1122");
        assertEquals("Hljeb", artikl.getNaziv());
    }

    @Test
    void setNaziv() {
        Artikl artikl = new Artikl("Hljeb", 15, "hljeb1122");
        artikl.setNaziv("Burek");
        assertEquals("Burek", artikl.getNaziv());
    }

    @Test
    void getCijena() {
        Artikl artikl = new Artikl("Hljeb", 15, "hljeb1122");
        assertEquals(15, artikl.getCijena());
    }

    @Test
    void setCijena() {
        Artikl artikl = new Artikl("Pita", 25, "pita1122");
        artikl.setCijena(40);
        assertEquals(40, artikl.getCijena());
    }

    @Test
    void getKod() {
        Artikl artikl = new Artikl("Hljeb", 15, "hljeb1122");
        assertEquals("hljeb1122", artikl.getKod());
    }

    @Test
    void setKod() {
        Artikl artikl = new Artikl("Sirnica", 35, "sirnica1122");
        artikl.setKod("sirnica1000");
        assertEquals("sirnica1000", artikl.getKod());
    }
}
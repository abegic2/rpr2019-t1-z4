package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl [] artikli = new Artikl[50];
    private int brojArtikala=0;

    public boolean dodajArtikl(Artikl artikal) {
        if(brojArtikala<50) {
            artikli[brojArtikala]= new Artikl(artikal.getNaziv(),artikal.getCijena(),artikal.getKod());
            brojArtikala=brojArtikala+1;
            return true;
        }
        return false;
    }

    public int getBrojArtikala() {
        return brojArtikala;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public void setArtikli(Artikl[] artikli) {
        this.artikli = artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0; i<brojArtikala; i++) {
            if(artikli[i].getKod().equals(kod)) { // ako je artikl pronadjen
                Artikl izbaceniArtikl = new Artikl(artikli[i].getNaziv(),artikli[i].getCijena(),artikli[i].getKod());
                artikli[i]=null;
                for(int j=i; j<brojArtikala-1; j++) {
                    artikli[i]=artikli[i+1];
                }
                artikli[brojArtikala-1]=null;
                brojArtikala=brojArtikala-1;
                return izbaceniArtikl;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupnaCijena=0;
        for(int i=0; i<brojArtikala; i++) {
            ukupnaCijena=ukupnaCijena+artikli[i].getCijena();
        }
        return ukupnaCijena;
    }

}

package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl [] artikli= new Artikl[1000];
    private int brojArtikala=0;

    public Artikl[] getArtikli() {
        return artikli;
    }

    public void setArtikli(Artikl[] artikli) {
        this.artikli = artikli;
    }

    public int getBrojArtikala() {
        return brojArtikala;
    }

    public void setBrojArtikala(int brojArtikala) {
        this.brojArtikala = brojArtikala;
    }

    public boolean dodajArtikl(Artikl artikal) {
        if(brojArtikala<1000) {
            artikli[brojArtikala]= new Artikl(artikal.getNaziv(),artikal.getCijena(),artikal.getKod());
            brojArtikala=brojArtikala+1;
            return true;
        }
        return false;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0; i<brojArtikala; i++) {
            if(artikli[i].getKod().equals(kod)) { // uslov pronalaska
                Artikl izbaceniArtikl = new Artikl(artikli[i].getNaziv(),artikli[i].getCijena(),artikli[i].getKod());
                artikli[i]=null;
                for(int j=i; j<brojArtikala-1; j++) { // izbacivanje
                    artikli[i]=artikli[i+1];
                }
                artikli[brojArtikala-1]=null;
                brojArtikala=brojArtikala-1;
                return izbaceniArtikl;
            }
        }
        return null;
    }


}

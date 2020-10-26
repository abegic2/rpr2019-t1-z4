package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl [] artikli= new Artikl[1000];
    private int brojArtikala=0;

    public boolean dodajArtikl(Artikl artikal) {
        if(brojArtikala<1000) {
            artikli[brojArtikala]= new Artikl(artikal.getNaziv(),artikal.getCijena(),artikal.getKod());
            brojArtikala=brojArtikala+1;
            return true;
        }
        return false;
    }

}

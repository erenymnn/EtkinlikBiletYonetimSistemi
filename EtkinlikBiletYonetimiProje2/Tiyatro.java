package EtkinlikBiletYonetimiProje2;

public class Tiyatro extends Etkinlik {
    private String oyunYazari;
    private int oyunSuresi;

    public String getOyunYazari() {
        return oyunYazari;
    }

    public void setOyunYazari(String oyunYazari) {
        this.oyunYazari = oyunYazari;
    }

    public int getOyunSuresi() {
        return oyunSuresi;
    }

    public void setOyunSuresi(int oyunSuresi) {
        this.oyunSuresi = oyunSuresi;
    }

    public Tiyatro(int tarih, String isim, String yer, String oyunYazari, int oyunSuresi) {
        super(tarih, isim, yer);
        this.oyunYazari = oyunYazari;
        this.oyunSuresi = oyunSuresi;
    }

    @Override
    public String toString() {
        return ", Tiyatro{"+"oyunYazari="+oyunYazari+", oyunSuresi="+oyunSuresi+'}';
    }
}

package EtkinlikBiletYonetimiProje2;

public class Etkinlik {
    private int tarih;
    private String isim;
    private String Yer;

    public Etkinlik(int tarih, String isim, String yer) {
        this.tarih = tarih;
        this.isim = isim;
        Yer = yer;
    }

    @Override
    public String toString() {
        return "Tarih: " + tarih + ", Isim: " + isim + ", Yer: " + Yer;
    }

}


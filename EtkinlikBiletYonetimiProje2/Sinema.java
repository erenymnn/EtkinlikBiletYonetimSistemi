package EtkinlikBiletYonetimiProje2;

public class Sinema  extends Etkinlik {
    private int filmsuresi;
    private String yonetmen;

    public Sinema(int tarih, String isim, String yer, int filmsuresi, String yonetmen) {
        super(tarih, isim, yer);
        this.filmsuresi = filmsuresi;
        this.yonetmen = yonetmen;
    }

    public int getFilmsuresi() {
        return filmsuresi;
    }

    public void setFilmsuresi(int filmsuresi) {
        this.filmsuresi = filmsuresi;
    }

    public String getYonetmen() {
        return yonetmen;
    }

    public void setYonetmen(String yonetmen) {
        this.yonetmen = yonetmen;
    }

    @Override
    public String toString() {
        return "Sinema{"+"film Süresi=" + filmsuresi + ", yonetmen=" + '\''+'}';
    }
}

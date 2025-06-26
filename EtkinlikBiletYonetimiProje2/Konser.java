package EtkinlikBiletYonetimiProje2;

public class Konser extends Etkinlik {
    private String sanatciAdi;
    private String MuzikTuru;

    public String getSanatciAdi() {
        return sanatciAdi;
    }

    public void setSanatciAdi(String sanatciAdi) {
        this.sanatciAdi = sanatciAdi;
    }

    public String getMuzikTuru() {
        return MuzikTuru;
    }

    public void setMuzikTuru(String muzikTuru) {
        MuzikTuru = muzikTuru;
    }

    public Konser(int tarih, String isim, String yer, String sanatciAdi, String muzikTuru) {
        super(tarih, isim, yer);
        this.sanatciAdi = sanatciAdi;
        MuzikTuru = muzikTuru;
    }

    @Override
    public String toString() {
        return ", Konser{"+"sanatciAdi="+sanatciAdi+", MuzikTuru="+MuzikTuru+'}';
    }
}

package EtkinlikBiletYonetimiProje2;

public class BiletNormal extends Bilet{
    @Override
    public double hesaplaFiyat() {
        return 100;
    }

    public BiletNormal(int biletNo) {
        super(biletNo);
    }

    @Override
    public void sat() {
        if (!isSatildiMi()) {
            setSatildiMi(true);
            System.out.println("🎫 Normal bilet satıldı! No: " + getBiletNo() + " Fiyat: " + getFiyat() + " TL");
        } else {
            System.out.println("⚠️ Bu normal bilet zaten satılmış.");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

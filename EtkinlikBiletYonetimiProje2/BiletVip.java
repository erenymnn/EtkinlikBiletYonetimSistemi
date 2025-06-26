package EtkinlikBiletYonetimiProje2;

public class BiletVip extends Bilet{

    public BiletVip(int biletNo) {
        super(biletNo);
    }

    @Override
    public double hesaplaFiyat() {
        return 250.0;
    }

    @Override
    public void sat() {
        if (!isSatildiMi()) {
            setSatildiMi(true);
            System.out.println("🔥 VIP Bilet No " + getBiletNo() + " satıldı! Fiyat: " + getFiyat() + " TL");
        } else {
            System.out.println("❌ VIP bilet zaten satılmış.");
        }
    }

}

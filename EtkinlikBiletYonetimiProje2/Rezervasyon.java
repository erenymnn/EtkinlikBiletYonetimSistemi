package EtkinlikBiletYonetimiProje2;

public class Rezervasyon {
    private Etkinlik etkinlik;
    private Bilet bilet;
    private String musteriAdi;
    private boolean onaylandi;

    public Rezervasyon(Etkinlik etkinlik, Bilet bilet, String musteriAdi) {
        this.etkinlik = etkinlik;
        this.bilet = bilet;
        this.musteriAdi = musteriAdi;
        this.onaylandi = false;
    }

    public void onayla() {
        if (!onaylandi) {
            onaylandi = true;
            System.out.println("✅ Rezervasyon onaylandı: " + musteriAdi);
            bilet.sat(); // Biletin satıldığını işaretle
        } else {
            System.out.println("⚠️ Bu rezervasyon zaten onaylanmış.");
        }
    }

    @Override
    public String toString() {
        return "Rezervasyon{" +
                "etkinlik=" + etkinlik +
                ", bilet=" + bilet.getClass().getSimpleName() +
                ", biletNo=" + bilet.getBiletNo() +
                ", musteriAdi='" + musteriAdi + '\'' +
                ", onaylandi=" + onaylandi +
                '}';
    }
}
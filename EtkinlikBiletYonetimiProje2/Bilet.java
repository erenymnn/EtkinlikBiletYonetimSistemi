package EtkinlikBiletYonetimiProje2;

public abstract class  Bilet {
    private int biletNo;
    private double fiyat;
    private boolean satildiMi;

    public Bilet(int biletNo) {
        this.biletNo = biletNo;
        this.satildiMi = false;
        this.fiyat = hesaplaFiyat(); //fiyat burada belirlenir.
    }

    public int getBiletNo() {
        return biletNo;
    }

    public void setBiletNo(int biletNo) {
        this.biletNo = biletNo;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public boolean isSatildiMi() {
        return satildiMi;
    }

    public void setSatildiMi(boolean satildiMi) {
        this.satildiMi = satildiMi;
    }
    public void sat() {
        if (!satildiMi) {
            satildiMi = true;
            System.out.println("✅ Bilet No: " + biletNo + " başarıyla satıldı.");
            System.out.println("💰 Fiyat: " + fiyat + " TL");
        } else {
            System.out.println("⚠️ Bu bilet zaten satılmış! Bilet No: " + biletNo);
        }
    }

    public abstract double hesaplaFiyat();    //alt sınıflar implement edicek bunu.
    }



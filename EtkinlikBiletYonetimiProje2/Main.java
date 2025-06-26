package EtkinlikBiletYonetimiProje2;

public class Main {
    public static void main(String[] args) {

      Konser konser = new Konser(2025-8-15,"Tarkan konseri","İstanbul Üsküdar meydan","Tarkan","Pop");
      Bilet bilet = new BiletVip(1);

      Rezervasyon rezervasyon=new Rezervasyon(konser,bilet,"Eren yaman");
      rezervasyon.onayla();

        System.out.println(rezervasyon);


        Sinema film1 = new Sinema(
                2025-6-30,
                "Ayla",
                "Kültürpark Sineması İzmi",
                120, // film süresi dakika
                "Can Ulkay"
        );

        Bilet bilet2=new BiletVip(2324);
        Rezervasyon rezervasyon2=new Rezervasyon(film1,bilet2,"Sevil Eldek");
        rezervasyon2.onayla();
        System.out.println(rezervasyon2);


        Tiyatro tiyatro1 = new Tiyatro(
                2025-10-05,
                "Keşanlı Ali Destanı",
                "İstanbul Şehir Tiyatrosu",
                "Haldun Taner",
                135 // oyun süresi dakika
        );

        Bilet bilet3=new BiletNormal(12424);
        Rezervasyon rezervasyon3=new Rezervasyon(tiyatro1,bilet3,"Yusuf gün");
        rezervasyon3.onayla();
        System.out.println(rezervasyon3);
    }
}

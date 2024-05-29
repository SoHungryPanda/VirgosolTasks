public class Odev9 {
    public static void main(String[] args) {
        float tutar = 123.456f;
        int inttutar = (int) tutar;
        int ikisitoplami = inttutar + inttutar;
        //byte byteTutar = (byte) inttutar;
        //Üstteki bu dönüşüm çalışmadı, neden çalışmadığını araştır.

        //Veli'nin ya da Ali'nin aldığı ürünler ya da paraları miktarına dair bilgi verilmediği için
        // ikisinin de verilen fiyattaki üründen birer tane aldığı
        // ve parlarının toplamının da bunların toplamı olduğu varsayılmıştır.
        System.out.print("Tutar:");
        System.out.printf("%,.2f" , tutar);
        System.out.printf("\n");
        System.out.print("Ali'nin görmek istediği v1:");
        System.out.printf("%,.0f" , tutar);
        //Hemen üstteki de tutarın print edilirken dönüştürülmesini sağlayan metot.
        System.out.printf("\n");
        System.out.print("Ali'nin görmek istediği v2:");
        System.out.println(inttutar);
        System.out.println("Veli'nin birikimi (tam sayı):" + inttutar);
        System.out.println("Veli'nin birikimi (byte):" + Integer.toBinaryString(inttutar));
        //System.out.println("Veli'nin birikimi (byte):");
        //System.out.println(Integer.toBinaryString(byteTutar));
        System.out.println("İkisinin paraları toplamı (tam sayı):" + ikisitoplami);
    }
}

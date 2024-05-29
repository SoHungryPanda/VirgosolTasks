//Ali ve Veli, marketten alışveriş yaparken aldıkları ürünlerin fiyatlarını hesaplamak istiyorlar.
//Ali, bir ürünün fiyatını 123.456 TL olarak görüyor.
//Ancak Ali, ondalık kısmı görmek istemiyor ve bu fiyatı tam sayı olarak dönüştürmek istiyor.
//Veli ise, kendi birikimlerini tam sayı olarak hesapladıktan sonra byte cinsine dönüştürmek istiyor.
//Son olarak, Ali ve Veli aldıkları ürünlerin toplam fiyatını hesaplamak istiyorlar.
//
//Ali ve Veli'nin bu dönüşümleri yaparak toplam fiyatı hesaplayan bir Java programı yazınız.

public class Odev9 {
    public static void main(String[] args) {
        float tutar = 123.456f;
        int inttutar = (int) tutar;
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
    }
}

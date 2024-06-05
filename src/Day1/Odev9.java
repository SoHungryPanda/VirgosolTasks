package Day1;

public class Odev9 {
    public static void main(String[] args) {
        float tutar = 123.456f;
        int inttutar = (int) tutar;
        int ikisitoplami = inttutar + inttutar;
        //byte byteTutar = (byte) inttutar;
        System.out.print("Tutar:");
        System.out.printf("%,.2f", tutar);
        System.out.print("\n" + "Ali'nin görmek istediği v1:");
        System.out.printf("%,.0f", tutar);
        System.out.print("\n" + "Ali'nin görmek istediği v2:");
        System.out.println(inttutar);
        System.out.println("Veli'nin birikimi (tam sayı):" + inttutar);
        System.out.println("Veli'nin birikimi (byte):" + Integer.toBinaryString(inttutar));
        //System.out.println("Veli'nin birikimi (byte):");
        //System.out.println(Integer.toBinaryString(byteTutar));
        System.out.println("İkisinin paraları toplamı (tam sayı):" + ikisitoplami);
    }
}

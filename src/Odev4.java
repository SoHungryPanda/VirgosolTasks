//4- Aşağıdaki açıklamaları dikkate alarak, özel karakterlerin kullanımıyla ilgili bir Java programı yazınız.
//Programda, Ali'nin adını, yaşını, boyunu ve banka hesabındaki para miktarını ekrana yazdırınız.
//Her bilgi satırını yeni bir satıra geçecek şekilde ve her bilgi arasında bir tab boşluğu olacak şekilde yazdırınız.
//
//Açıklamalar:
//- `\n`: Yeni satır. Sonraki satırın başına gider.
//- `\t`: Tab tuşu. Sonraki tab sekmesine kadar imleci götürür.
//İstenen Çıktı:
//Benim adım Ali.    Yaşım: 23
//Boyum: 1.86 metre.    Banka hesabımda 41561.51 TL para var.

public class Odev4 {
    public static void main(String[] args) {

        String a = "Ali";
        int b = 23;
        double c = 1.86;
        double d = 25680.0;

        System.out.print("Benim adım " + a + "." + "\t");
        System.out.print("Yaşım " + b + "\n");
        System.out.print("Boyum " + c + " metre." + "\t");
        System.out.print("Banka hesabımda " + d + " TL para var.");
        }
    }



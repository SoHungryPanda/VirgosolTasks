//11- Aşağıdaki Java programında, mantıksal ve ilişkisel operatörleri kullanarak
// belirli koşulları kontrol ediniz ve sonuçları ekrana yazdırınız.
//Programda `if`, `else`, `for`, `while` gibi kontrol yapıları kullanmadan ifadelerin doğruluğunu
// ve mantıksal işlemleri gerçekleştiriniz.
//
//Görevler:
//1. Üç adet tam sayı belirleyiniz: `a = 5`, `b = 8`, `c = 12`.
//2. Aşağıdaki ifadelerin doğruluğunu kontrol ediniz ve sonuçları ekrana yazdırınız:
//    - `a`, `b` ve `c`'nin toplamı 25'e eşit mi?
//    - `a` ve `b`'nin toplamı `c`'den büyük mü?
//    - `a`'nın karesi `b`'den küçük mü?
//    - `b`, `a` ve `c` arasında ortanca değer mi?
//    - `c`, `a` ve `b`'nin toplamından küçük mü?
//
//3. Mantıksal ve ilişkisel operatörleri kullanarak ifadelerin doğruluğunu kontrol ediniz
// ve sonuçları ekrana yazdırınız.
//
//İstenen Çıktı:
//
//a, b ve c'nin toplamı 25'e eşit mi? true
//a ve b'nin toplamı c'den büyük mü? true
//a'nın karesi b'den küçük mü? true
//b, a ve c arasında ortanca değer mi? true
//c, a ve b'nin toplamından küçük mü? false
//
//Bu işlevi yerine getiren Java kodunu yazınız.
public class Odev11 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = 12;
        int d = a+b+c;
        int r = 25;
        int e = a+b;
        int f = a*a;
        //Görev 1:
        System.out.println("a, b ve c toplamı 25'e eşit mi?");
        System.out.println(d==r);
        System.out.println("a ile b'nin toplamı `c`'den büyük mü?");
        System.out.println(e>c);
        System.out.println("a'nın karesi b'den küçük mü?");
        System.out.println(f<b);
        System.out.println("b, a ve c arasında ortanca değer mi?");
        System.out.println(a<b & b<c);
        System.out.println("c, a ile b'nin toplamından küçük mü?");
        System.out.println(c<e);
    }
}

//Bir Java programı yazınız.
// Bu program, Ali'nin adını, yaşını, boyunu ve cebindeki para miktarını
// birleştirip ekrana yazdıracaktır.
// Programın şu adımları takip etmesi gerekmektedir:
//
//1. Ali'nin adını bir `String` değişkeni olarak tanımlayınız
// (örneğin, `String ad = "Ali";`).
//2. Ali'nin yaşını bir `int` değişkeni olarak tanımlayınız
// (örneğin, `int yas = 23;`).
//3. Ali'nin boyunu bir `double` değişkeni olarak tanımlayınız
// (örneğin, `double boy = 1.86;`).
//4. Ali'nin cebindeki para miktarını bir `double` değişkeni olarak tanımlayınız
// (örneğin, `double para = 25680.0;`).
//5. Bu bilgileri birleştirerek ekrana yazdırınız.

public class Odev3 {
    public static void main(String[] args) {

        String a = "Ali";
        int b = 23;
        double c = 1.86;
        double d = 25680.0;

        System.out.print("Benim adım " + a);
        System.out.print(", yaşım " + b);
        System.out.print(", boyum " + c);
        System.out.print(" ve cebimde " + d);
        System.out.print(" TL para var");
    }
}
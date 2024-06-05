package Day1;

public class Odev11 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = 12;
        int d = a + b + c;
        int r = 25;
        int e = a + b;
        int f = a * a;
        //Görev 1:
        System.out.println("a, b ve c toplamı 25'e eşit mi?");
        System.out.println(d == r);
        System.out.println("a ile b'nin toplamı `c`'den büyük mü?");
        System.out.println(e > c);
        System.out.println("a'nın karesi b'den küçük mü?");
        System.out.println(f < b);
        System.out.println("b, a ve c arasında ortanca değer mi?");
        System.out.println(a < b & b < c);
        System.out.println("c, a ile b'nin toplamından küçük mü?");
        System.out.println(c < e);
    }
}

import static java.lang.Math.pow;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int i = 4;
        int j = (int) pow(i,2);
        int k = (int) pow(i,3);

        System.out.println("Sabit sayi =" + i);
        System.out.println("Sayinin karesi =" + j);
        System.out.println("Sayinin kübü =" + k);

    }
}


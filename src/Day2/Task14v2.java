package Day2;

import java.util.Scanner;

public class Task14v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Karşılaştırma için bir kelime giriniz...");
        String kelime1 = scanner.next();
        System.out.println("Girdiğiniz ilk kelime:" + kelime1);

        System.out.println("Karşılaştırma için bir kelime daha giriniz....");
        String kelime2 = scanner.next();
        System.out.println("Girdiğiniz ikinci kelime:" + kelime2);

        if (kelime1.equalsIgnoreCase(kelime2)) {
            System.out.println(kelime1 + " ile " + kelime2 + " aynı kelimedir");
        } else {
            System.out.println(kelime1 + " ile " + kelime2 + " farklıdır");
        }
    }
}

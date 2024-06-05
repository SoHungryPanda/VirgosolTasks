package Day2;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Karşılaştırma için bir kelime giriniz...");
        String kelime1 = scanner.next();
        System.out.println("Girdiğiniz ilk kelime:" + kelime1);

        System.out.println("Karşılaştırma için bir kelime daha giriniz....");
        String kelime2 = scanner.next();
        System.out.println("Girdiğiniz ikinci kelime:" + kelime2);

        if (kelime1.length() != kelime2.length()) {
            System.out.println(kelime1 + " ile " + kelime2 + " farklıdır");
        } else{
            for (int i = 0; i <= (kelime1.length() - 1); i++) {
                if (kelime1.toLowerCase().charAt(i) != kelime2.toLowerCase().charAt(i)) {
                    i = kelime1.length();
                    System.out.println(kelime1 + " ile " + kelime2 + " farklıdır");
                } else {
                    System.out.println(kelime1 + " ile " + kelime2 + " aynı kelimedir");
                }
            }
        }
    }
}


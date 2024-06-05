package Day2;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("100'lük sistemdeki ders notunu giriniz");
        int a = scanner.nextInt(); //ders notunu a değişkenine atıyoruz

        if (a >100 || a<0) {
            System.out.println("Yanlış bir sayı girdiniz");
        } else if (a >= 90) {
            System.out.println("Ders notu = 'A'");
        } else if (a >= 80) {
            System.out.println("Ders notu = 'B'");
        } else if (a >= 70) {
            System.out.println("Ders notu = 'C'");
        } else if (a >= 60) {
            System.out.println("Ders notu = 'D'");
        } else {
            System.out.println("Ders notu = 'F'");
        }
    }
}

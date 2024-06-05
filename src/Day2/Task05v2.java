package Day2;

import java.util.Scanner;
//öğrenci sayısını kullanıcıya sorup o sayıda öğrencinin notunu sırasıyla alan program
public class Task05v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Öğrenci sayısını giriniz");
        int k = scanner.nextInt();
        int i;
        for (i=1; i<=k; i++) {

            System.out.println(i + ". 100'lük sistemdeki ders notunu giriniz");
            int a = scanner.nextInt(); //ders notunu a değişkenine atıyoruz

            if (a > 100 || a < 0) {
                System.out.println("Geçersiz bir sayı girdiniz");
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
}

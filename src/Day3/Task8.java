package Day3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        //int i = 1528;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz");
        int i = scanner.nextInt();
        int sonuc = 0;

        while (i != 0) {
            sonuc = sonuc + (i % 10);
            i = i / 10;
        }
        System.out.println("Basamakların toplamı: " + sonuc);
    }
}

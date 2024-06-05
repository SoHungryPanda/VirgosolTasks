package Day3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        //int i = 1528;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz");
        int i = scanner.nextInt();
        int sonuc = 0;
        int a;

        for (a=i; a>0; a/=10) {
            sonuc = sonuc + (a % 10);
        }
        System.out.println("Basamakların toplamı: " + sonuc);
    }
}




package Day3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int sonuc = 0;
        int i;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Toplama işlemi için eklemek istediğiniz sayıyı giriniz, durdurmak için 0 giriniz:");
            i = scanner.nextInt();
            sonuc = sonuc + i;
            System.out.println("Girdiğiniz sayılar toplamı = " + sonuc);
        }
        while (i != 0);
        System.out.println("İşemi durdurdunuz. Girdiğiniz sayılar toplamı = " + sonuc);
    }
}

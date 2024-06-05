package Day2;

import java.util.Scanner;

public class Task8v2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir tam sayı giriniz....");
        int i = scanner.nextInt();
        System.out.println("Girdiğiniz sayi:" + i);

        if ((i % 3 == 0) && (i % 5 == 0)) {
            System.out.println("Girdiğiniz sayı hem 3 hem de 5 ile bölünebilir");
        } else if (i % 3 == 0) {
            System.out.println("Girdiğiniz sayı 3'e bölünebilir");
        } else if (i % 5 == 0) {
            System.out.println("Girdiğiniz sayı 5'e bölünebilir");
        } else {
            System.out.println("Girdiğiniz sayı hem 3 hem de 5 ile bölünemez bir sayıdır");
        }
    }
}

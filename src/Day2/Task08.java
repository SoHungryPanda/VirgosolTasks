package Day2;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir tam sayı giriniz....");
        int i = scanner.nextInt();
        System.out.println("Girdiğiniz sayi:" + i);

        if ((i % 3 == 0) && (i % 5 == 0)) {
            System.out.println("Girdiğiniz sayı hem 3 hem de 5 ile bölünebilir");
        } else {
            System.out.println("Girdiğiniz sayı 3'e ya da 5'e bölünemez");
        }
    }
}

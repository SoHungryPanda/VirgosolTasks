package Day2;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı girin....");
        int sayi = scanner.nextInt();

        if (sayi < 0) {
            System.out.println("Girdiğiniz sayı negatiftir");
        } else System.out.println("Girdiğiniz sayı negatif değildir");

    }
}


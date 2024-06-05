package Day2;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir tam sayı giriniz....");
        int i = scanner.nextInt();
        System.out.println("Girdiğiniz sayi:" + i);

        if (i == 0) {
            System.out.println("Girdiğiniz sayı sıfırdır");
        } else if (i < 0) {
            System.out.print("Girdiğiniz sayı negatiftir");
        } else {
            System.out.print("Girdiğiniz sayı pozitiftir");
        }
    }

}

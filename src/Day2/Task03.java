package Day2;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı girin....");
        int sayi1 = scanner.nextInt();
        System.out.println("Bir sayı daha girin....");
        int sayi2 = scanner.nextInt();
        System.out.println("Girdiğiniz sayıların çarpımı=" + sayi1 * sayi2);
    }
}


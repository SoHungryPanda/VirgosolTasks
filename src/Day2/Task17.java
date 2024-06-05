package Day2;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz");
        int sayi = scanner.nextInt();
        System.out.println("Sayının karesi:" + sayi*sayi + "\n" + "Sayının kübü:" + sayi*sayi*sayi);
    }
}

package Day2;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir yıl değeri giriniz");
        int yil = scanner.nextInt();

        if (yil % 4 == 0) {
            System.out.println("Girdiğiniz yıl " + yil + ",2 bir artık yıldır");
        }
        else {
            System.out.println("Girdiğiniz yıl: " + yil + ", bir artık yıl değildir");
        }
    }
}

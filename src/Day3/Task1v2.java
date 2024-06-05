package Day3;

import java.util.Scanner;

public class Task1v2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("10 kez tekrar edilecek ifadeyi giriniz");
        String ifade = scanner.nextLine();

        for (int i=0; i<10; i++)
            System.out.println(ifade);
    }
}

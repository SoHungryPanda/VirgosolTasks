package Day3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mesajınızı giriniz");
        String mesaj = scanner.nextLine();

        // System.out.print("Yayınlanma limitini giriniz");
        //int limit = scanner.nextint();
        int limit = 5;

        int sayac = 1;

        do {
            System.out.println(sayac + "\t" + mesaj);
            sayac++;
        }
        while (sayac <= limit);
    }
}

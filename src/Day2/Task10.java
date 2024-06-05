package Day2;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir cümle giriniz....");
        String cumle1 = scanner.nextLine();
        System.out.println(cumle1);
        int boy1 = cumle1.length();
        System.out.println(boy1);

        System.out.println("Bir cümle daha giriniz....");
        String cumle2 = scanner.nextLine();
        System.out.println(cumle2);
        int boy2 = cumle2.length();
        System.out.println(boy2);

        if (boy1 < boy2) {
            System.out.println(cumle2);
        } else if (boy1 > boy2) {
            System.out.print(cumle1);
        } else {
            System.out.println("iki cümlenin uzunluğu eşittir");
        }
    }
}
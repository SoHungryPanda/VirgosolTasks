package Day2;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir cümle giriniz....");
        String cumle = scanner.nextLine();
        System.out.println(cumle);
        int boy = cumle.length();
        System.out.println(boy);

        if (boy < 50) {
            System.out.println("kısa bir cümle");
        }
        else {
            System.out.print("kısa olmayan bir cümle");
        }
    }
}

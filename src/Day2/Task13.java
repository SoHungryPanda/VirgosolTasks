package Day2;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir cümle giriniz....");
        String cumle = scanner.nextLine();
        System.out.println("Girdiğiniz cümle:" + cumle);

        System.out.println("Cümle içinde aranmasını istediğiniz bir karakter giriniz...");
        char karakter = scanner.nextLine().charAt(0);
        System.out.println("Cümle içinde kontrol edilmesini istediğiniz karakter:" + karakter);

        for (int i = 0; i <=(cumle.length() - 1); i++)
        {
            if (cumle.charAt(i) == karakter) {
                System.out.println("Cümlenizde,\t" + karakter + "\t karakteri \t" + i + ".nci indekste bulunmaktadır");
            }
        }
    }
}

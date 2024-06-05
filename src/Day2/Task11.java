package Day2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir cümle giriniz....");
        String cumle = scanner.nextLine();
        System.out.println("Girdiğiniz cümle:" + cumle);

        System.out.println("Cümle başlangıcı için kontrol edilecek kelimeyi giriniz...");
        String kelime = scanner.nextLine();
        System.out.println("Cümle başlangıcı için kontrol edilmesini istediğiniz kelime:" + kelime);

        if (cumle.toLowerCase().startsWith(kelime.toLowerCase())) {
            System.out.println("Cümleniz,\t" + cumle + "\nKontrol kelimeniz,\t" + kelime + "\t ile başlıyor");
        } else {
            System.out.println("Cümleniz,\t" + cumle + "\nKontrol kelimeniz,\t" + kelime + "\t ile başlaMIyor");
        }
    }
}
package Day2;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir kelime giriniz....");
        String kelime = scanner.next();
        int boy = kelime.length();
        System.out.println(boy);
    }
}

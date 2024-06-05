package Day2;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üçgenin birinci kenar uzunluğunu girin...");
        int a = scanner.nextInt();
        System.out.println("Üçgenin ikinci kenar uzunluğunu girin...");
        int b = scanner.nextInt();
        System.out.println("Üçgenin üçüncü kenar uzunluğunu girin...");
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("Bu bir eşkenar üçgendir");
        }
        //else {System.out.println("Bu bir eşkenar üçgen değildir");}
        else if (a == b || b == c || c == a) {
            System.out.println("Bu bir ikizkenar üçgendir");
        } else {
            System.out.println("Bu bir çeşitkenar üçgendir");
        }
    }
}


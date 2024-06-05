package Day3;
//Kullanıcıdan alınan bir sayıya kadar Fibonacci serisini while döngüsü kullanarak yazdıran bir Java programı yazın.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //int i = scanner.nextInt();

        int i = 25;
        int a = 1;
        int b = 0;
        while (a <= i)
            { System.out.println ("Fibonacci:" + a);
                int c = a + b;
                b = a;
                a = c;
        }
    }
}

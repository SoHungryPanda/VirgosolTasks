package Day3;

import java.util.Scanner;

public class Task2v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktöriyel değeri hesaplanacak sayıyı giriniz");
        int a = scanner.nextInt();
        //int a = 5;
        int b = 1;
                for (int i = 1; i <= a; i++) {
                    b = b * i;
                }
                System.out.println("Girilen " + a + " değerinin faktöriyeli: " + b + "'dir");
    }
}

package Day2;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir gezegen adı giriniz");
        String gezegen = scanner.next();

        switch (gezegen) {
            case "Merkür":
                System.out.print("İç Gezegen");
                break;
            case "Venüs":
                System.out.print("İç Gezegen");
                break;
            case "Dünya":
                System.out.print("İç Gezegen");
                break;
            case "Mars":
                System.out.print("İç Gezegen");
                break;
            case "Jüpiter":
                System.out.print("Dış Gezegen");
                break;
            case "Satürn":
                System.out.print("Dış Gezegen");
                break;
            case "Uranüs":
                System.out.print("Dış Gezegen");
                break;
            case "Neptün":
                System.out.print("Dış Gezegen");
                break;
            default:
                System.out.println("Yanlış bir değer girdiniz");
        }
    }
}


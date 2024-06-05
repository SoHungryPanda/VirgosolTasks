package Day2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1'den 12'ye kadar bir ay numarası seçiniz....");
        int ayNo = scanner.nextInt();

        if (ayNo==6 || ayNo==7 || ayNo==8) {
            System.out.println("Girdiğiniz değer bir yaz ayıdır");
        }
        //else  {System.out.println("Girdiğiniz değer bir yaz ayı değildir");
        else if (ayNo==9 || ayNo==10 || ayNo==11) {
            System.out.println("Girdiğiniz değer bir sonbahar ayıdır");
        }
        else if (ayNo==12 || ayNo==1 || ayNo==2) {
            System.out.println("Girdiğiniz değer bir kış ayıdır");
        }
        else if (ayNo==3 || ayNo==4 || ayNo==5) {
            System.out.println("Girdiğiniz değer bir ilkbahar ayıdır");
        }
        else  {
            System.out.println("Girdiğiniz değer hatalıdır");
        }
    }
}

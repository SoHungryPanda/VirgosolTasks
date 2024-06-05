package Day3;

//import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Bir ifade/cümle giriniz....");
        //String ifade = scanner.next();
        //int boy = ifade.length();

        String ifade = "Ödevler Yordu";

        for (int i = 0; i < ifade.length(); i++) {
            char karakter = ifade.charAt(i);
            if (ifade.indexOf(karakter) != i) {
                System.out.println("Tekrar eden karakter: " + karakter);
            }
        }
    }
}
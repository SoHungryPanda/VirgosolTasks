package Day3;

public class Task2 {
    public static void main(String[] args) {
        int a = 5;
                for (int i = (a-1); i > 0; i--) {
                    a = a * i;
                }
                System.out.println("Girilen değerin faktöriyeli: " + a + "'dir");
    }
}

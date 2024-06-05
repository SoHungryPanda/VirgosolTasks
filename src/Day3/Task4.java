package Day3;

public class Task4 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //int i = scanner.nextInt();
        int i = 11;
        boolean k = true; // asal sayı ise true

        for (int a = 2; a < i; a++) {
            if (i % a == 0) {
                System.out.println(i + " asal bir sayı değildir");
                k = false;
                break;
            }
            }
        if (k==true)
        {System.out.println(i + " asal bir sayıdır");
        }
    }
}

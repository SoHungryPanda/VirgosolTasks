package Day2;

public class Task09 {
    public static void main(String[] args) {
        String str = "abc";

        char chIlk = str.charAt(0);
        int chIlkASCII = chIlk;
        System.out.println("Karakter:" + chIlk + ", ASCII Değeri:" + chIlkASCII);

        char chIkinci = str.charAt(1);
        int chIkinciASCII = chIkinci;
        System.out.println("Karakter:" + chIkinci + ", ASCII Değeri:" + chIkinciASCII);

        char chUcuncu = str.charAt(2);
        int chUcuncuASCII = chUcuncu;
        System.out.println("Karakter:" + chUcuncu + ", ASCII Değeri:" + chUcuncuASCII);
    }
}

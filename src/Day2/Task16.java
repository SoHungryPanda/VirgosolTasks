package Day2;

public class Task16 {
    public static void main(String[] args) {
        String cumle = "Bu kötü bir hikaye. Ancak, Ali'nin çabalarıyla daha iyi olabilir.";
        cumle = cumle.replace("kötü","iyi");
        cumle = cumle.replace(".","!");
        System.out.println(cumle);
    }
}

package homework_2.Zara_Avetyan;

public class First {
    public static void main(String[] args) {
        int n = 456, k;
        String a = "";
        while (n / 2 != 0) {
            k = n % 2;
            a += k;
            n /= 2;
        }
        a += 2;
        System.out.println(a);
    }
}

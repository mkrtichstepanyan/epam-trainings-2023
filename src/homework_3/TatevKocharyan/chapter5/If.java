package homework_3.TatevKocharyan.chapter5;

public class If {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int a = 10;
        int k = 10;
        int b = 5;
        int c = 5;
        int d = 4;
        if (i == 10) {
            if (j < 20) a = b;
            if (k > 100) c = d;
            else System.out.println("a is = " + (a = c));

        } else System.out.println(a = d);
    }
}

package homework_2.Vardan_Mkrtchyan;

public class OpEquals {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        a += 5; // 6
        b *= 4; // 8
        c += a * b; // 8 * 6 + 3
        System.out.println("c += a * b = " + c);
        c %= 6;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c % 6 = " + c);


    }
}

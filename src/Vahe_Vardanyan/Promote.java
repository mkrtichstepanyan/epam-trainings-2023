package Vahe_Vardanyan;

public class Promote {
    public static void main(String[] args) {
        byte b4 = 42;
        char c1 = 'a';
        short s = 1024;
        int i1 = 50000;
        float f = 5.67f;
        double d1 = .1234;
        double result = (f * b4) + ( i1 / c1 )  - (d1 * s);
        System.out.println((f * b4) + " + " + (i1 / c1) + " - " + (d1 * s));
        System.out.println("result = " + result);

    }
}

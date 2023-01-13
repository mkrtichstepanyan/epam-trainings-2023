package Eduard_Eghiazaryan;

public class Promote {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.76f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.printf((f * b) + "+" + (i / c) + "-" + (d * s));
        System.out.printf("result = " + result);
    }
}

package homework_1.Levon_Harutyunyan.homework_1;

public class Promote {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 12.34;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println( (f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
    }
}

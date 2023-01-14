package homework_1.Diana_Melkonyan;

public class Promote {
    public static void main(String[] args) {
        byte b = 42;
        char c = 97;
        short s = 1024;
        int i = '썐';
        float f = 5.67F;
        double d = 0.1234;
        double result = (double)(f * (float)b + (float)(i / c)) - d * (double)s;
        System.out.println(f * (float)b + " + " + i / c + " - " + d * (double)s);
        System.out.println("result = " + result);
    }
}

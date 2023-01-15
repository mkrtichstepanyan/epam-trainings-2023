package homework_2.Levon_Harutyunyan;

public class ByteShift {
    public static void main(String[] args) {
        byte a = 64;
        byte b;
        int i;

        i = a << 2;
        b = (byte) (a << 2);
        System.out.println("Original value of a: " + a);
        System.out.println("i and b: " + i + " " + b);
    }
}

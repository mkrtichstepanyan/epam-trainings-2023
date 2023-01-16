package homework_2.Zara_Avetyan;

public class ByteShift {
    public static void main(String args[]) {
        byte a = 64, b; // 0100 0000
        int i;
        i = a << 2;
        b = (byte) (a << 2);
        System.out.println("Original value of a: " + a);
        System.out.println("i and b: " + i + " " + b);
    }
}
package homework_2.garik_gharibyan;

public class ByteShift {
    public static void main(String[] args) {

        byte b = 64;
        byte bShift;
        int i;

        i = b << 2;
        bShift = (byte) (b << 2);

        System.out.println("\nOriginal value b = " + b);
        System.out.println("(int) b << 2 = " + i);
        System.out.println("(byte) b << 2 = " + bShift);
    }
}

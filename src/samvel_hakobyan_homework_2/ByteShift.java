package samvel_hakobyan_homework_2;

public class ByteShift {
    public static void main(String[] args) {

        byte a = 64, b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);
        System.out.println("Initial value a: " + a);
        System.out.println("i and b " + i + " " + b);
    }
}

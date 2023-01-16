package homework_2.Alina_Vardanovna.chapter4;

public class ByteShift {

    public static void main(String[] args) {

        byte a = 64;
        byte b;
        int i;

        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("a-ի սկզբնական արժեքը հավասար է " + a);
        System.out.println("i and b: " + i + " " + b);

    }

}

package homework_1.Hovhannes_Gspeyan;

/**
 * This class demonstrates
 * casts
 */
public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nConversation int to byte: ");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);

        System.out.println("\nConversation of double to int: ");
        i = (int) d;
        System.out.println("i and d " + i + " " + d);

        System.out.println("\nConversation of double to byte: ");
        b = (byte) d;
        System.out.println("b and d " + b + " " + d);
    }
}

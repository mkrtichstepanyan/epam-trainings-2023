package homework_1.Diana_Melkonyan;

public class Conversion {
    public static void main(String[] args) {
        int i = 257;
        double d = 323.142;
        System.out.println("\nConversion of int to byte.");
        byte b = (byte)i;
        System.out.println("i and b " + i + " " + b);
        System.out.println("\nConversion of double to int.");
        i = (int)d;
        System.out.println("d and i " + d + " " + i);
        System.out.println("\nConversion of double to byte.");
        b = (byte)((int)d);
        System.out.println("d and b " + d + " " + b);
    }
}

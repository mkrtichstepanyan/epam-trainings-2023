package Gohar_Hakobyan;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        // int cast to byte
        System.out.println("\nArgishti_Mesropyan.Conversion of type int to byte");
        b = (byte) i;
        System.out.println("i և b " + i + " " + b);

        System.out.println("\nArgishti_Mesropyan.Conversion of type double to int");
        i = (int) d;
        System.out.println("d և i " + d + " " + i);

        System.out.println("\nArgishti_Mesropyan.Conversion of type double to byte");
        b = (byte) d;
        System.out.println("d և b " + d + " " + b);
    }
}

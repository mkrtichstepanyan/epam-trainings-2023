package TatevKocharyan;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("\nArgishti_Mesropyan.Conversion of int to byte.");
        b = (byte) i;
        System.out.println(i + " to " + b);

        System.out.println("\n Convrsion doubl to int.");
        i = (int) d;
        System.out.println(d + " to " + i);

        System.out.println("\n Argishti_Mesropyan.Conversion double to byte");
        b = (byte) d;
        System.out.println(d + " to " + b);
    }
}
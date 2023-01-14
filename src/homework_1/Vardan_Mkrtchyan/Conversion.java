package homework_1.Vardan_Mkrtchyan;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("\n Conversetion of int to byte.");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);
        System.out.println("\n Conversetion of double to int");
        i = (int)d;
        System.out.println("d and i" + d + " " + i);
        System.out.println("\n Conversation of double to byte. ");
        b = (byte) d;
        System.out.println("d and b " + d + " " + b);
    }
}

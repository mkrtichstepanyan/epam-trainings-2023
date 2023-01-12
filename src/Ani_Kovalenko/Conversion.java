package Ani_Kovalenko;

public class Conversion {
    public static void main (String[] args){
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("\nConverting int to byte");
        b = (byte) i;
        System.out.println("i and b = " + i + " and " + b);
        System.out.println("\nConverting double to int");
        i = (int) d;
        System.out.println("int and double = " + i + " and " + d);
        System.out.println("\nConverting double into byte");
        b = (byte) d;
        System.out.println("byte and double = " + b + " and " + d);
    }
}

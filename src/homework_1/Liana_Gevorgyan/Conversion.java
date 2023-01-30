package homework_1.Liana_Gevorgyan;

public class Conversion {
    public static void main(String args[]){
        byte b;
        int i=257;
        double d= 323.142;
        System.out.println("\nConversion of int to byte");

        b=(byte) i;
        System.out.println("i and b " + i +" "+ b);
        System.out.println("\nConversion of double to int");
        i=(int) d;
        System.out.println("d and i " + d + " " + i);
        System.out.println("\nConversion od double to byte");
        b=(byte) d;
        System.out.println("b and d " + d + " "+ b);


    }
}

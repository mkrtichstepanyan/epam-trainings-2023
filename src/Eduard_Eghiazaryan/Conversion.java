package Eduard_Eghiazaryan;

public class Conversion {
    public static void main (String[] args){
        byte b;
        int i = 257;
        double d =323.142;
        System.out.printf("\nTransformation int in byte.");
        b = (byte) i;
        System.out.printf("i and b:" + i + " " + b);
        System.out.printf("\nTransformation double and byte. " );
        b = (byte) d;
        System.out.printf("d and b:" + d + " " + b);
    }
}

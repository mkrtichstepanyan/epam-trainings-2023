package Qnarik_Khachatryan;

//Demonstrate casts
class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nConversion of int to byte.");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);
        //the remainder of the division of 257 by 256 (the range of a byte)

        System.out.println("\nConversion of double to int.");
        i = (int) d;
        System.out.println("d and i " + d + " " + i);
        //fractional component is lost

        System.out.println("\nConversion of double to byte.");
        b = (byte) d;
        System.out.println("d and b " + d + " " + b);
        //When d is converted to a byte, its fractional component is lost, and the value is reduced modulo 256, which in this case is 67
    }
}

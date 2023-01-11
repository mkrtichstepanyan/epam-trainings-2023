package Galust_Arzumanyan


// This method is used to convert data types
class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 565.656;
        System.out.println("Conversion of int to byte");
        b = (byte) i;
        System.out.println("i is: " + i + " b is: " + b);

        System.out.println("Conversion of double to int");
        i = (int) d;
        System.out.println("i is: " + i + " d is: " + d);
        System.out.println("Conversion of double to byte");
        b = (byte) d;
        System.out.println("d is: " + d + " b is: " + b);


    }
}
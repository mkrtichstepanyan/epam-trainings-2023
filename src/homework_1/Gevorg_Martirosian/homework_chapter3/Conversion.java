package homework_1.Gevorg_Martirosian.homework_chapter3;
//demonstration of casting
public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("cast int to byte");
        b = (byte) i;
        System.out.println("i and b: " + i + " " + b);

        System.out.println("cast double to int");
        i = (int) d;
        System.out.println("d and i: " + d + " " + i);

        System.out.println("cast double to byte");
        b = (byte) d;
        System.out.println("d and b: " + d + " " + b);
    }
}

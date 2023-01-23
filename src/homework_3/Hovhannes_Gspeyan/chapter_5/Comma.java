package homework_3.Hovhannes_Gspeyan.chapter_5;

/**
 * This class demonstrates a
 * comma in for loop
 */
public class Comma {
    public static void main(String[] args) {
        int a, b;
        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}

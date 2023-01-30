package homework_4.Hovhannes_Gspeyan.chapter_7;

/**
 * this class uses an array
 * to pass a variable number
 * of arguments to a method.
 * This is an old - style
 * approach to variable - length
 * arguments
 */
public class PassArray {

    static void vaTest(int[] v) {
        System.out.print("Number of args: " + v.length + " Contents: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] n1 = {10};
        int[] n2 = {1, 2, 3};
        int[] n3 = {};

        vaTest(n1);
        vaTest(n2);
        vaTest(n3);
    }
}

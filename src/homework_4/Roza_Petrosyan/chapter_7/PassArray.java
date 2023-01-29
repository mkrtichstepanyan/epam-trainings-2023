package homework_4.Roza_Petrosyan.chapter_7;

// Use an array to pass a variable number of
// arguments to a method. This is an old style
// approach to variable-length arguments.
public class PassArray {
    static void vaTest(int[] v) {
        System.out.println("Number of args: " + v.length + " Contents: ");

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Notice how an array must be created to
        // hold the arguments
        int[] n1 = {10};
        int[] n2 = {1, 2, 3};
        int[] n3 = {};

        vaTest(n1); // 1 args
        vaTest(n2); // 3 args
        vaTest(n3); // no args

    }
}

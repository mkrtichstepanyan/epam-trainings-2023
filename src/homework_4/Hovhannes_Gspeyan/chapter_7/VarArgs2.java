package homework_4.Hovhannes_Gspeyan.chapter_7;

/**
 * this class demonstrates
 * varargs with standard arguments
 */
public class VarArgs2 {

    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Contents: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("One varargs: ",10);
        vaTest("three varargs: ",1, 2, 3);
        vaTest("No varargs: ");
    }
}

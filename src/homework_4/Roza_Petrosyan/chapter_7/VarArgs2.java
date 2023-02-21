package homework_4.Roza_Petrosyan.chapter_7;

// Use varargs with standard arguments
public class VarArgs2 {
    // Here, msg is a normal parameter and v is a
    // varargs parameter
    static void vaTest(String msg, int... v) {
        System.out.println(msg + v.length + " Contents: ");

        for (int x : v) {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("One vararg: ", 10);
        vaTest("Three varargs: ", 1, 2, 3);
        vaTest("No vararg: ");
    }
}

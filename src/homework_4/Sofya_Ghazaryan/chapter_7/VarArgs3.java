package homework_4.Sofya_Ghazaryan.chapter_7;

import java.util.concurrent.atomic.AtomicReference;

public class VarArgs3 {
    static void vaTest(int... v) {
        System.out.println("vaTest (int . . . ): " +
                v.length +
                " Contents: ");

        for (int x :
                v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.println("vaTest (boolean . . . ): " +
                "Numbers of args: " + v.length +
                " Contents: ");
        for (boolean x :
                v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(String msg, int... v) {
        System.out.println("vaTest(String, int ...): " +
                msg + v.length +
                " Contents: ");

        for (int x :
                v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Testing: ", 1, 2, 3);
        vaTest(true, false, false);
    }
}

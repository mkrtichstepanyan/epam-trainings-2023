package homework_4.Anush_Ananyan.Chapter_7;

import java.sql.SQLOutput;

public class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Contents: ");

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("One varargs: ", 10);
        vaTest("Three varargs: ", 1,2,3);
        vaTest("No varargs: " );
    }
}
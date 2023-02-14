package homework_4_1.Andranik_Sargsyan.chapter_7.varargs;

public class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.println(msg + v.length + " amount: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("one parameter: ", 10);
        vaTest("three parameter: ", 1,2,3);
        vaTest("no parameter: " );
    }
}

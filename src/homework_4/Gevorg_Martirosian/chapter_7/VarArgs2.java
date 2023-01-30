package homework_4.Gevorg_Martirosian.chapter_7;

public class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " content: ");

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("one varArg: ", 10);
        vaTest("three varArgs: ", 1, 2, 3);
        vaTest("no varArgs: ");
    }
}

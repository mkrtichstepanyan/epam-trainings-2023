package homework_4.Diana_Melkonyan.chapter7;

public class VarArgs {

    // vaTest() now uses a vararg.
    static void vaTest(int... v) {
        System.out.print("Number of args: " + v.length + " Contents: ");

        for (int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        // Motice how vaTest() can be called with a
        // variable number of arguments.
        vaTest(10);      //1 arg
        vaTest(1, 2, 3); //3 args
        vaTest();            // no args

    }
}

package homework_4_1.Andranik_Sargsyan.chapter_7.varargs;

public class VarArgs {
    static void vaTest(int... v) {
        System.out.print("amount of arguments: " + v.length + " content: ");
        for (int x : v) {
            System.out.print(x + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}

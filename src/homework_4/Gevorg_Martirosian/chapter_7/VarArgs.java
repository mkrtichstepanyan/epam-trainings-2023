package homework_4.Gevorg_Martirosian.chapter_7;

public class VarArgs {
    //vaTest() now uses a vararg

    static void vaTest(int... v) {
        System.out.print("count of arguments: " + v.length + " content: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}

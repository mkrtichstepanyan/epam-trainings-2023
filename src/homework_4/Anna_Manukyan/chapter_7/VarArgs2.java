package homework_4.Anna_Manukyan.chapter_7;

//Demonstrate variable-length arguments
public class VarArgs2 {
    public static void main(String[] args) {
        vaTest("One vararg: ", 10);
        vaTest("Two varargs: ", 1, 2, 3);
        vaTest("No varargs: ");
    }

    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Contents: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

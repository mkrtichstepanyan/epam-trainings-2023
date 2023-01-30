package homework_4.Gevorg_Martirosian.chapter_7;

public class VarArgs3 {
    static void vaTest(int... v) {
        System.out.print("vaTest(int...): " + "count of arguments: " + v.length + " content");

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean...): " + "count of arguments: " + v.length + " content");

        for (boolean x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(String msg, int... v) {
        System.out.print("vaTest(String, int...): " + msg + v.length + " content");

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("testing: ", 10, 20);
        vaTest(true, false, false);
    }
}

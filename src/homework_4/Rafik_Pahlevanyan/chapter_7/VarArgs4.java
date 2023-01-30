package homework_4.Rafik_Pahlevanyan.chapter_7;

/*
    Varargs, overloading, and ambiguity.
    This program contains an error and will
    not compile
 */
public class VarArgs4 {
    static void vaTest(int... v) {
        System.out.print("vaTest(int ...) : "
                + "Number of args: " + v.length + " Contests: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean...) " +
                "Number of args: " + v.length + " Contests: ");
        for (boolean x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);    //OK
        vaTest(true, false, false);   //OK
//        vaTest();     //Ambiguous!
    }
}

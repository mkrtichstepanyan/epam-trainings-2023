package homework_4.Anna_Manukyan.chapter_7;

//Demonstrate variable-length arguments
public class VarArgs3 {
    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Testing ",10,20);
        vaTest(true, false,false);
    }

    static void vaTest(int... v) {
        System.out.print("vaTest(int ...): " + "Number of args: " + v.length + " Contents: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean ...): " +"Number of args: "+ v.length + " Contents: ");
        for (boolean x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static void vaTest(String msg, int... v) {
        System.out.print("vaTest(String, int ...): " +msg+ v.length + " Contents: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }


}

package homework_4.TatevKocharyan.chapter7;

public class VarArgs {
    static void vaTest(int... v) {
        System.out.println("Number of args: " + v.length + "Contents: ");
        for (int x : v) {
            System.out.println(x + " ");
            System.out.println();
        }
    }
}
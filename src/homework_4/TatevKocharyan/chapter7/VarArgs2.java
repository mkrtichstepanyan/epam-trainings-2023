package homework_4.TatevKocharyan.chapter7;

public class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.println(msg + v.length + " Contents: ");
        for (int x : v) {
            System.out.println(x + " ");
            System.out.println();
        }
    }
}
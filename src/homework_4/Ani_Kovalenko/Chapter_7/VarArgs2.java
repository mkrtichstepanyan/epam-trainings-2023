package homework_4.Ani_Kovalenko.Chapter_7;

public class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Contents: ");
        for (int x : v) {
            System.out.print(x+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest ("One vararg: ", 10);
        vaTest ("Tree varargs: ", 1,2,3);
        vaTest ("No varargs: ");
    }
}

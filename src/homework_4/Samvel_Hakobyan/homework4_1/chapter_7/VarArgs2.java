package homework_4.Samvel_Hakobyan.homework4_1.chapter_7;

public class VarArgs2 {
    static void vatTest2(String msg, int... v) {
        System.out.print(msg + v.length + "Contests: ");


        for (int x : v) {
            System.out.print(x + "");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        vatTest2("One vararg: ",10);
        vatTest2("Three varargs: ",1,2,3);
        vatTest2("No varargs: ");
    }
}

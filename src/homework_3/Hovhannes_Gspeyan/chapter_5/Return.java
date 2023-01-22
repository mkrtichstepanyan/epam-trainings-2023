package homework_3.Hovhannes_Gspeyan.chapter_5;

/**
 * This class demonstrates
 * return statement
 */
public class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("Before the return. ");
        if (t) {
            return;
        }
        System.out.println("This won't execute. ");
    }
}

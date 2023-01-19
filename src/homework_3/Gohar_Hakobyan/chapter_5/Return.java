package homework_3.Gohar_Hakobyan.chapter_5;

public class Return {
    public static void main(String[] args) {

        boolean t = true;
        System.out.println("Before return");
        if (t) {
            return;
        }
        System.out.println("This won't execute.");
    }
}

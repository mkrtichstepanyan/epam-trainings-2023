package homework_3.Anush_Ananyan.chapter_5;

public class Return {
    public static void main(String[] args) {
        Boolean t = true;

        System.out.println("Before the return.");

        if (t) return;

        System.out.println("This won't execute.");
    }
}

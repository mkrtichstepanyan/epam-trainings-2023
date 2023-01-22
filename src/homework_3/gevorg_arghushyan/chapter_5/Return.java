package homework_3.gevorg_arghushyan.chapter_5;

public class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("Before operator return.");
        if (t) return;
        System.out.println("This will not be output.");
    }
}

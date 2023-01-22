package Eduard_Eghiazaryan.chapter_5;

public class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("Before the operator return");
        if (t) return;
        System.out.println("This will not be performed");
    }
}

package homework_3.Zara_Avetyan.Chapter_5;

public class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("Before the return.");
        if (t) return;
        System.out.println("This won't execute.");
    }
}
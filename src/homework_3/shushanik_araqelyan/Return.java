package homework_3.shushanik_araqelyan;

public class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("Before the return .");
        if (t) return;// return to caller
        System.out.println("this won't execdute .");
    }
}

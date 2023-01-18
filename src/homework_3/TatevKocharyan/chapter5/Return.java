package homework_3.TatevKocharyan.chapter5;

public class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("Before the return");
        if (t) return;
        System.out.println("This wont execute.");
    }
}
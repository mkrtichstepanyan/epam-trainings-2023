package homework_10.Roza_Petrosyan.chapter_10.uncaught_exc;

public class Exc1 {
    static void subroutine() {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("This will not be printed");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }

        System.out.println("After catch statement");
    }

    public static void main(String[] args) {
        Exc1.subroutine();
    }
}

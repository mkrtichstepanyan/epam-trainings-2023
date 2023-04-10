package homework_10.Eduard_Eghiazaryan;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;

        try {
            d = 0;
            a = 31 / d;
            System.out.println("This will not be printed");
        } catch (ArithmeticException exception) {
            System.out.println("Division by zero");
        }
        System.out.println("After catch statement");
    }
}

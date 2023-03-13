package homework_10.Anush_Ananyan;

public class Exc2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int a = 42/d;
            System.out.println("This will not be printed");
        } catch (ArithmeticException e){
            System.out.println("Division by 0");
        }
        System.out.println("After catch statement");
    }
}

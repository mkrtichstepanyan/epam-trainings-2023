package homework_10.Hovhannes_Abrahamyan;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;

        try {
            d = 0;
            a = 42 / d;
        }catch (ArithmeticException e){
            System.out.println("Division by zero! ");
        }
        System.out.println("After catch statement ");
    }
}

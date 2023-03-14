package homework_10.gevorg_arghushyan;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;
        try{
            d = 0;
            a = 42 / d;
            System.out.println("It won't displayed");
        }catch (ArithmeticException e){
            System.out.println("Division by zero is not allowed");
        }
        System.out.println("After operator Catch.");
    }
}

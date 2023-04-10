package homework_10.Samvel_Hakobyan;

public class Exc2 {
    public static void main(String[] args) {

        int d, a;

        try{
            d = 0;
            a = 42/d;
            System.out.println("This will not by printed. ");
        }catch (ArithmeticException e){
            System.out.println("Division by zero. ");
        }
        System.out.println("After catch statement. ");
    }
}

package homework_10.Yeghia_Ansuryan.Chapter_10.Exceptions;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Generic Exception catch.");
        }
//        catch(ArithmeticException e) { Error - unreachable
        System.out.println("This is never reached.");
    }
}


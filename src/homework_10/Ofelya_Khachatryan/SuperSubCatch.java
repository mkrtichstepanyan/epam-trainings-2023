package homework_10.Ofelya_Khachatryan;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Generic Exception catch.");
        }
//        catch(ArithmeticException e){    ERROR -unreachable
//            System.out.println("This is never reached.");
//        }
    }
}

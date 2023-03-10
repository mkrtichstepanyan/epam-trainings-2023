package homework_10.Hovhannes_Abrahamyan;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        }catch (Exception e){
            System.out.println("Generic exception catch. ");
//        }catch (ArithmeticException e){  Error: unreachable statement
            System.out.println("This is never reached! ");
        }
    }
}

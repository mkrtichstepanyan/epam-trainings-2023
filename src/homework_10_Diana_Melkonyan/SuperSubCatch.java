package homework_10_Diana_Melkonyan;

public class SuperSubCatch {
    public static void main(String[] args) {
        try{
            int a =0;
            int b = 42/a;
        }catch (Exception e){
            System.out.println("Generic Exception catch.");
        }
        /* This catch is never reached because
        AritmeticException is a subclass of Exception.*/
     //   catch(ArithmeticException e) {//Error -unreachable}
            System.out.println("This is never reached.");

    }
}

package homework_10.Inesa_Mkrtchyan.Chapter_10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try{
            int a = 0;
            int b = 42/a;
        }catch(Exception e){
            System.out.println("Generic Exeption catch.");
        }/*catch(ArithmeticException e){//ArithmeticException is a subclass of Exeption
            System.out.println("This is never reached.");
        }*/
    }
}

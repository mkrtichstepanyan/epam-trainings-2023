package homework_10.Varsik_Pijoyan.chapter_10;

//This is the right version of previous SuperSubCatch class.
public class SuperSubCatch2 {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception");
        }catch (Exception e){
            System.out.println("Generic exception catch.");
        }
    }
}

package homework_10.araksya_ghazaryan.chapter_10;

public class SuperSubChatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        }catch (Exception e){
            System.out.println("Generic exeption catch: ");
//       catch (ArithmeticException e ){    //Error -unreachable
//            System.out.println("This is never reached: ");
            }
        }
    }
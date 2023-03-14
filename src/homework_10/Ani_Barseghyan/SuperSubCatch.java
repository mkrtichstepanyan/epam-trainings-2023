package homework_10.Ani_Barseghyan;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Generic ");
        }
//        catch (ArithmeticException e) {
//            System.out.println("This is never reached");
//        }
    }
}

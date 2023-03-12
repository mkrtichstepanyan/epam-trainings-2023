package homework_10.gevorg_arghushyan;

public class SuperSubCathc {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e){
            System.out.println("Catching a Generic Exception. ");
        }
//        catch (ArithmeticException e) {
//            System.out.println("This will never be achieved");
//        }
    }
}

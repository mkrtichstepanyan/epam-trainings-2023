package homework_10.Eduard_Eghiazaryan;

public class MultipleCatches {
    public static void main(String[] args) {
        try{
            int a = args.length;
            System.out.println("a: " + a);
            int b = 42 / a;
            int[] c = {1};
            c[42] = 99;
        }catch (ArithmeticException exception){
            System.out.println("Divide by 0: " + exception);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Array index oob: " + exception);
        }
        System.out.println("After try/catch blocks.");
    }
}

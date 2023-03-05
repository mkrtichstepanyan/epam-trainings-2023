package homework_10.Varsik_Pijoyan.chapter_10;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int[] c = {1};
            c[42] = 99;
        } catch (ArithmeticException exc) {
            System.out.println("Divide by zero: " + exc);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Array index oob: " + exc);
        }
        System.out.println("After try/catch blocks.");
    }
}

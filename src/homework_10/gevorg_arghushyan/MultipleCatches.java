package homework_10.gevorg_arghushyan;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int [] c = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Division in 0: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bounds for an index in an array: " + e);
        }
        System.out.println("After blocks try/catch. ");
    }
}

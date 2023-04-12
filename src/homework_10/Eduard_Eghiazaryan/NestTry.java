package homework_10.Eduard_Eghiazaryan;

public class NestTry {
    public static void main(String[] args) {

        try {
            int a = args.length;

            int b = 42 / a;
            System.out.println("a = " + a);

            try {
                if (a == 1) {
                    a = a / (a - a);
                }
                if (a == 2){
                    int[] c = {1};
                    c[42] = 99;
                }
            }catch (ArrayIndexOutOfBoundsException exception){
                System.out.println("Array index out-of-bounds: " + exception);
            }
        }catch (ArithmeticException exception){
            System.out.println("Divide by 0: " + exception);
        }
    }
}
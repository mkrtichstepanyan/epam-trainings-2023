package homework_10.garik_gharibyan.chapter_10;

public class NestTry {
    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 42 / a;
            try {
                if (a == 1)
                a = a / (a - a);

                int [] c = {1};
                c[42] = 99;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out-of-bound: " + e);
            }
            System.out.println("-------------------------");

        } catch (ArithmeticException e) {
            System.out.println("Divided by 0: " + e);
        }
    }
}

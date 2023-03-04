package homework_10.garik_gharibyan.chapter_10;

public class MethNestTry {
    static void nestTry(int i) {
        try {
            if (i == 1) {
                i = i / (i - i);
            }
            int[] c = {};
            c[42] = 99;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out-of-bound: " + e);
        }
    }

    public static void main(String[] args) {
        try {
            int a = 2;
            int b = 42 / a;
            nestTry(a);
            System.out.println("-------------------");
        } catch (ArithmeticException e) {
            System.out.println("Divided by 0: " + e);
        }
    }
}

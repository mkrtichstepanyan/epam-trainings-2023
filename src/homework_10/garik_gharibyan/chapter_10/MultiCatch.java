package homework_10.garik_gharibyan.chapter_10;

public class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int[] val = {1, 2, 3};
        try {
            int result = a / b;
            val[10] = 19;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught: " + e);
        }
        System.out.println("After multi-catch");
    }
}

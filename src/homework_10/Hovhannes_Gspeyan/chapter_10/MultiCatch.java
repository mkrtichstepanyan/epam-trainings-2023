package homework_10.Hovhannes_Gspeyan.chapter_10;

public class MultiCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] valS = {1, 2, 3};

        try{
            int result = a / b;
            valS[10] = 19;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught: " + e);
        }
        System.out.println("After multi catch ");
    }
}

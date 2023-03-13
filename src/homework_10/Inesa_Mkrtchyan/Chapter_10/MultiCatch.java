package homework_10.Inesa_Mkrtchyan.Chapter_10;

public class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int[] vals = {1, 2, 3};
        try {
            int result = a / b;
            //vals[10] = 19;

        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught: " + e);
        }
        System.out.println("After m7ulti-catch.");
    }
}

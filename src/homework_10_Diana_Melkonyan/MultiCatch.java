package homework_10_Diana_Melkonyan;

public class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int[] vals = {1, 2, 3};

        try {
            int result = a / b; //generate an ArithmeticException

            //vals[10] = 19; //generate an ArrayIndexOutBoundsException

            //This catch clause catches both exception.
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught: " + e);
        }
        System.out.println("After multi-catch");
    }
}

package homework_18.garik_gharibyan.lambda_operator;
interface NumericFuck{
    int func(int n);
}
public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFuck factorial;

        factorial = (n) -> {

            int result = 1;

            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        };


        System.out.println("Yhe factorial of 3 is: " + factorial.func(3));
        System.out.println("Yhe factorial of 5 is: " + factorial.func(5));
    }
}

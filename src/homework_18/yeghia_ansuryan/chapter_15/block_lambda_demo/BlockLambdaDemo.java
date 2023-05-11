package homework_18.yeghia_ansuryan.chapter_15.block_lambda_demo;

public class BlockLambdaDemo {
    public static void main(String[] args) {

        NumericFunc factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++)
                result = i * result;

            return result;
        };

        System.out.println("the factorial of 3 is " + factorial.func(3));
        System.out.println("the factorial of 5 is " + factorial.func(5));
    }
}

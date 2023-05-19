package homework_18.Ani_Kovalenko.chapter_15_lambda.example_4;

public class BlockLambdaDemo {

    public static void main(String[] args) {

        NumericFunc factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("The factorial of 3 is " + factorial.func(3));
        System.out.println("The factorial of 5 is " + factorial.func(5));
    }
}

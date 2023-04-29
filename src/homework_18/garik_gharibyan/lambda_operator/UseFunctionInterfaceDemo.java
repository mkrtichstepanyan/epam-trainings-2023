package homework_18.garik_gharibyan.lambda_operator;

import java.util.function.Function;

public class UseFunctionInterfaceDemo {
    public static void main(String[] args) {
        Function<Integer,Integer> function;

        function = (n) -> {
            int result = 1;
            for (int j = 1; j <= n; j++) {
                result *= j;
            }
            return result;
        };

        System.out.println("The factorial of 3 is: " + function.apply(3));
        System.out.println("The factorial of 5 is: " + function.apply(5));
    }
}

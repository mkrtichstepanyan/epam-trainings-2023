package homework_18.garik_gharibyan.lambda_operator;
interface SomeFunc<T>{
    T func(T t);
}
public class GenericFunctionalInterface {
    public static void main(String[] args) {
        SomeFunc<String> reverse;

        reverse = (str) -> {
            String result = "";
            int i;

            for (int j = str.length() -1; j >= 0; j--) {
                result += str.charAt(j);
            }

            return result;
        };

        System.out.println("lambda reversed is: " + reverse.func("Lambda"));
        System.out.println("Expression reversed is: " + reverse.func("Expression"));


        SomeFunc<Integer> factorial;

        factorial = (i) -> {
            int result = 1;
            for (int j = 1; j <= i; j++) {
                result *= j;
            }

            return result;
        };

        System.out.println("The factorial of 3 is: " + factorial.func(3));
        System.out.println("The factorial of 5 is: " + factorial.func(5));
    }
}

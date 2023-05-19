package homework_18.yeghia_ansuryan.chapter_15.predefined_functional_interfaces;

import java.util.function.Function;

public class UseFunctionInterfaceDemo {
    public static void main(String[] args) {

        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };

        System.out.println("The factorial of 3 is " + factorial.apply(3));
        System.out.println("The factorial of 5 is " + factorial.apply(5));
    }
}

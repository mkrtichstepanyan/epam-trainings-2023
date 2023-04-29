package homework_18.garik_gharibyan.lambda_operator;

interface NumericTest{
    boolean test(int i);
}
public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isEven;

        isEven =(n) -> (n % 2) == 0;

        if (isEven.test(10)) System.out.println(10 + " is Even");
        if (!isEven.test(9)) System.out.println(9 + " is not Even");


        NumericTest isNonNegative;

        isNonNegative = (n) -> n > 0;

        if (isNonNegative.test(10)) System.out.println(10 + " is non-negative");
        if (!isNonNegative.test(-10)) System.out.println(-10 + " is negative");
    }
}

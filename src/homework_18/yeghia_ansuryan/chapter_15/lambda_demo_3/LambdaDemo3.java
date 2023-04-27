package homework_18.yeghia_ansuryan.chapter_15.lambda_demo_3;

public class LambdaDemo3 {
    public static void main(String[] args) {

        NumericTest2 isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.teat(10, 2)) {
            System.out.println("2 is a factor of 10");
        }
        if (isFactor.teat(10, 3)) {
            System.out.println("3 is not a factor of 10");
        }
    }
}

package homework_19.Radik_Manasyan.chapter15;

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isEvent = (n) -> (n % 2) == 0;
        if (isEvent.test(10)) {
            System.out.println("Digit 10 is even");
        }
        if (!isEvent.test(9)) {
            System.out.println("Digit 9 is odd");
        }

        NumericTest isNonNeg = (n) -> n >= 0;
        if (isNonNeg.test(1)) {
            System.out.println("Digit 1 is not negative");
        }
        if (!isEvent.test(-1)) {
            System.out.println("Digit -1 is negative");
        }
    }
}

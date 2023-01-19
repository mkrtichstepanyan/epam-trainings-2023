package homework_3.Gevorg_Martirosian.chapter_5;

//checking, is the given number prime or not
public class FindPrime {
    public static void main(String[] args) {
        int number;
        boolean isPrime;

        number = 169;
        if (number < 2) {
            isPrime = false;
        } else isPrime = true;

        for (int i = 2; i <= number / i; i++) {
            if ((number % i) == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("the number is prime");
        } else {
            System.out.println("the number is not prime");
        }
    }
}

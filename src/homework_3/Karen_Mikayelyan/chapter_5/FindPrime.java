package homework_3.Karen_Mikayelyan.chapter_5;

// Test for primes.
public class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrive;
        num = 14;
        if (num < 2) {
            isPrive = false;
        } else {
            isPrive = true;
        }
        for (int i = 2; i <= num / i; i++) {
            if ((num % i) == 0) {
                isPrive = false;
                break;
            }
        }
        if (isPrive) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}

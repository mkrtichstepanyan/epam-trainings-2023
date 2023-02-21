package homework_3.Galust_Arzumanyan;


// This method is used to demonstrate a test for primes
class FindPrime {
    public static void main(String[] args) {
        boolean isPrime;

        int num = 7;

        if (num < 2) isPrime = false;
        else isPrime = true;


        for (int i = 2; i <= num / i; i++) {
            if ((num % 1) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println(" Prime ");
        else System.out.println(" Not Prime ");
    }
}

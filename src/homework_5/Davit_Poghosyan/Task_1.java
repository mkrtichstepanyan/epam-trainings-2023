package homework_5.Davit_Poghosyan;

public class Task_1 {

    public static void main(String[] args) {
        printNumbers(15);            // Question 1 -> try with different integer values instead of 10 only
//        System.out.println(sumNumbers(10));                    // Question 2
//        System.out.println(factorialDemo1(4));                 // Question 3
//        System.out.println(powerDemo(3,4));                   // Question 4
//        System.out.println(reverseNumber(1234));              // Question 5
 //         testPrime();                                           // Question 6
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        if (count > 0) {
            printNumbers(count - 1);
        }
        System.out.print(count + " ");
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static int sumNumbers(int i) {
        if (i <= 1) {
            return 1;
        }
        return i + sumNumbers(i - 1);
    }


        /* TODO: Question 3
            Write a program to find the factorial value of any number entered through the keyboard.
        */


    private static int factorialDemo1(int num) {
        if (num < 1) {
            return 1;
        } else {
            return num * factorialDemo1(num - 1);
        }
    }
     /* TODO: Question 4
         Two numbers are entered through the keyboard.
         Write a program to find the value of one number raised to the power of another.
         (Do not use Java built-in method)
     */


    private static int powerDemo(int base, int power) {
        if (power == 0) {
            return 1;
        } else {
            return base * powerDemo(base, power - 1);
        }
    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    static int reverse=0;
    private static int reverseNumber(int number) {

        if (number == 0) {
            return reverse;
        }
        int digit = number % 10;
        reverse = reverse * 10 + digit;
        return reverseNumber(number / 10);
    }


    /* TODO: Question 6
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */

    public static void testPrime() {
        int number = 16;
        if (isPrime(number, number / 2)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    private static boolean isPrime(int n, int i) {
        if (i == 1) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return isPrime(n, i - 1);
    }
}


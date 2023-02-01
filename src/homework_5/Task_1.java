package homework_5;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
//        printNumbers(10);            // Question 1 -> try with different integer values instead of 10 only
//        System.out.println(sumNumbers(15));                // Question 2
//        factorialDemo1();            // Question 3
//        System.out.println(powerDemo(2,14));                 // Question 4
//        reverseDemo();
        System.out.println(reverseNumberRec(12345, 0));
//        testPrime();                 // Question 7
//        System.out.println(isPrime(7,2));
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        if (count <= 0) {
            return;
        }
        printNumbers(count - 1);
        System.out.print(count + " ");
        // Todo write your code here ...
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static int sumNumbers(int sum) {
        if (sum == 1) {
            return 1;
        }
        return sum + sumNumbers(sum - 1);
        // Todo write your code here ...
    }


    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static void factorialDemo1() {
        Scanner console = new Scanner(System.in);
        int num; // To hold number
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
        // Todo write your code here ...
        int result = factorial(num);
        System.out.println("The factorial of " + num + " is: " + result);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
     /* TODO: Question 4
         Two numbers are entered through the keyboard.
         Write a program to find the value of one number raised to the power of another.
         (Do not use Java built-in method)
     */

    public static int powerDemo(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return base * powerDemo(base, power - 1);
    }


     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */


    public static void reverseDemo() {
        Scanner console = new Scanner(System.in);

        int number;
        int reverse = 0;

        System.out.print("Enter the number ");
        number = console.nextInt();

        int temp = number;
        int remainder = 0;

        reverse = reverseNumber(number, remainder);
        System.out.println("Reverse of " + number + " is " + reverse);
    }

    private static int reverseNumber(int number, int reverse) {
        if (number < 10) {
            return reverse * 10 + number;
        }
        return reverseNumber(number / 10, reverse * 10 + number % 10);
    }


    static int reverseNumberRec(int numberToReverse, int recursiveReversedNumber) {
        if (numberToReverse > 0) {
            int mod = numberToReverse % 10;
            recursiveReversedNumber = recursiveReversedNumber * 10 + mod;
            numberToReverse /= 10;
            return reverseNumberRec(numberToReverse, recursiveReversedNumber);
        }
        return recursiveReversedNumber;
    }


    /* TODO: Question 6
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */
    public static void testPrime() {
        Scanner console = new Scanner(System.in);
        int number;

        System.out.print("Enter the positive integer: ");
        number = console.nextInt();
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return;
        }
        boolean result = isPrime(number, number / 2);
        if (result) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        // Todo write your code here ...
    }

    public static boolean isPrime(int number, int divisor) {
        if (divisor == 1) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return isPrime(number, divisor - 1);
    }
}


package homework_5.rafik_pahlevanyan.tasks;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
//        printNumbers(20);            // Question 1 -> try with different integer values instead of 10 only
//        System.out.println(sumNumbers(10));                // Question 2
//        factorialDemo1();            // Question 3
//        powerDemo();                 // Question 4
//        reverseDemo();             // Question 5
//        testPrime();                 // Question 6
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        if (count > 0) {
            printNumbers(count-1);
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
    public static void factorialDemo1() {
        Scanner console = new Scanner(System.in);
        int num; // To hold number

        System.out.print("Enter any positive integer: ");
        num = console.nextInt();

        int result = findFactorial(num, 1);

        System.out.println("Factorial: " + num + " is: " + result);
    }

    private static int findFactorial(int num, int fact) {
        if (num == 1) {
            return fact;
        }
        fact *= num;
        return findFactorial(num - 1, fact);
    }

     /* TODO: Question 4
         Two numbers are entered through the keyboard.
         Write a program to find the value of one number raised to the power of another.
         (Do not use Java built-in method)
     */

    public static void powerDemo() {
        Scanner console = new Scanner(System.in);

        int base;
        int power;


        System.out.print("Enter the base number ");
        base = console.nextInt();

        System.out.print("Enter the power ");
        power = console.nextInt();

        int result = findPower(base, power, 1);

        System.out.println(base + " raised to the power of " + power + " is " + result);
    }

    private static int findPower(int base, int power, int result) {
        if (power == 0) {
            return result;
        }
        result *= base;
        return findPower(base, power - 1, result);
    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static void reverseDemo() {
        Scanner console = new Scanner(System.in);

        int number;

        System.out.print("Enter the number ");
        number = console.nextInt();

        int reverse = reverseNumber(number, 0);

        System.out.println("Reverse of " + number + " is " + reverse);
    }

    private static int reverseNumber(int number, int reverse) {
        if (number == 0) {
            return reverse;
        }
        int digit = number % 10;
        reverse = reverse * 10 + digit;
        return reverseNumber(number / 10, reverse);
    }


    /* TODO: Question 6
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */


    public static void testPrime() {
        Scanner console = new Scanner(System.in);

        int number;

        System.out.print("Enter the positive integer ");
        number = console.nextInt();

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
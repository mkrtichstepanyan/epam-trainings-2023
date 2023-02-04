package homework_5.Araksya_Ghazaryan;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
//        printNumbers(10);            // Question 1 -> try with different integer values instead of 10 only
//        System.out.println(sumNumbers(5));             // Question 2
//        factorialDemo1();                              // Question 3
//        powerDemo();                                   // Question 4
//        reverseNumber();                               // Question 5
//        System.out.println(testPrime(15,3));           // Question 6
        }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        if (count > 0) {
            System.out.println(count);
            count--;
            printNumbers(count);
        }
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static int sumNumbers(int n) {
        if (n <= 1)
            return n;
        return n + sumNumbers(n - 1);
    }

    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static void factorialDemo1() {
        Scanner console = new Scanner(System.in);
        int num;

        System.out.print("Enter any positive integer: ");
        num = console.nextInt();

        int result = factorial(num, 1);

        System.out.println("Factorial: " + result);
    }

    private static int factorial(int num, int fact) {
        if (num == 1) {
            return fact;
        }
        fact *= num;
        return factorial(num - 1, fact);
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

        int result = powerD(base, power, 1);

        System.out.println("Result: " + result);
    }

    public static int powerD(int base, int power, int result) {
        if (power != 0) {
            result *= base;
            return powerD(base, power - 1, result);
        } else {
            return result;
        }
    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static void reverseNumber() {
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
        int num = number % 10;
        reverse = reverse * 10 + num;
        return reverseNumber(number / 10, reverse);
    }

    /* TODO: Question 6
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */
    public static boolean testPrime(int number, int i) {
        if (number < 2 || number % i == 0) {
            return false;
        }
        if (number % 2 == 0) {
            return (number == 2);
        }
        if (i * i > number) {
            return true;
        }
        return testPrime(number, i + 2);
    }
}
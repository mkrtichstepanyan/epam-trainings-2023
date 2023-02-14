package homework_5.Vladimir_Vanyan.Task_1;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        //   printNumbers(10);   // Question 1 -> try with different integer values instead of 10 only
        //   sumNumbers();        // Question 2
        //   System.out.println(factorialDemo1(8));    // Question 3
        //   powerDemo();        // Question 4
        //   reverseNumber();  // Question 5
        //   readSetIntegers();  // Question 6
        //   testPrime();        // Question 7

    }

    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        if (count <= 0) {
            return;
        } else {
            // Recursively call printNumbers
            printNumbers(count - 1);
            // Print number while returning from recursion
            System.out.print(" " + count);
        }
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */

    public static void sumNumbers() {
        int sum = 0;
        sum = recursionNumberCalculate(10);
        System.out.println("The sum is: " + sum);
    }

    private static int recursionNumberCalculate(int num) {

        if (num == 0) {
            return 1;
        } else {
            return num + recursionNumberCalculate(num - 1);
        }
    }


    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static int factorialDemo1(int num) {

        int fact = 1; // To hold factorial
        if (num == 1) {
            return num;
        } else {
            return num * factorialDemo1(num - 1);
        }
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
        int result = 1;

        System.out.print("Enter the base number ");
        base = console.nextInt();

        System.out.print("Enter the power ");
        power = console.nextInt();

        result = powerCalculate(base, power);

        System.out.println("Result: " + result);
    }

    private static int powerCalculate(int base, int power) {
        if (power == 1) {
            return base;
        } else {
            return base * powerCalculate(base, power - 1);
        }
    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */


    public static int reverseNumber(int number) {
        return innerReverseNumber(number, 0);
    }

    private static int innerReverseNumber(int number, int reverse) {
        if (number == 0) {
            return reverse;
        } else {
            reverse = reverse * 10 + number % 10;
            return innerReverseNumber(number / 10, reverse);
        }
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


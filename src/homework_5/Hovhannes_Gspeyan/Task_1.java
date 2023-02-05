package homework_5.Hovhannes_Gspeyan;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        printNumbers(10);            // Question 1 -> try with different integer values instead of 10 only
        sumNumbers(10);               // Question 2
        factorialDemo1();            // Question 3
        powerDemo();                 // Question 4
        reverseNumber();             // Question 5
//        readSetIntegers();           // Question 6

        testPrime();                 // Question 7
    }

    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        if (count < 1) {
            return;
        }
        printNumbers(count - 1);
        System.out.print(count + " ");
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static void sumNumbers(int i) {
        int sum = i * (i + 1) / 2;
        if (i == 0) {
            return;
        }
        sumNumbers(i - 1);
        System.out.println("Sum: " + sum);
    }

    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static void factorialDemo1() {
        Scanner console = new Scanner(System.in);
        int num; // To hold number
        int fact; // To hold factorial

        System.out.print("Enter any positive integer: ");
        num = console.nextInt();

        fact = factorialDemo1Util(num);
        System.out.println("fact: " + fact);
    }

    private static int factorialDemo1Util(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorialDemo1Util(num - 1);
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
        int result;

        System.out.print("Enter the base number ");
        base = console.nextInt();

        System.out.print("Enter the power ");
        power = console.nextInt();

        result = powerDemoUtil(base, power);
        System.out.println("Result: " + result);
    }

    private static int powerDemoUtil(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return base * powerDemoUtil(base, power - 1);
    }
    /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static void reverseNumber() {
        Scanner console = new Scanner(System.in);

        int number;
        int reverse;

        System.out.print("Enter the number ");
        number = console.nextInt();

        int temp = number;
        int remainder = 1;

        while (temp >= 10) {
            remainder *= 10;
            temp /= 10;
        }
        reverse = reverseNumberUtil(number, remainder);
        System.out.println("Reverse of " + number + " is " + reverse);
    }

    private static int reverseNumberUtil(int number, int remainder) {
        if (number == 0) {
            return 0;
        }
        return (number % 10) * remainder + reverseNumberUtil(number / 10, remainder / 10);
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

        boolean flag;

        flag = testIsPrime(number, number / 2);
        if (flag) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }

    private static boolean testIsPrime(int number, int i) {
        if (i == 1) {
            return true;
        }
        if (number % i == 0) {
            return false;
        }
        return testIsPrime(number, i - 1);
    }
}


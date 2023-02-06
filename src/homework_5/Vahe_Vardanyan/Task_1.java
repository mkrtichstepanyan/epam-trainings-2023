package homework_5.Vahe_Vardanyan;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        printNumbers(10);            // Question 1 -> try with different integer values instead of 10 only
        sumNumbers();                // Question 2
        factorialDemo1();            // Question 3
        powerDemo();                 // Question 4
        reverseNumber();             // Question 5
//      readSetIntegers();           // Question 6
        testPrime();                 // Question 7
    }




    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        if (count == 0) {
            return;
        }
        System.out.println(count + " ");
        printNumbers(--count);
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static void sumNumbers() {
        int sum = 0;
        sum = sumNumberRecursion(10);
        System.out.println("Sum: " + sum);
    }

    private static int sumNumberRecursion(int n) {
        if (n == 0) {
            return 0;
        }else {
            return n + sumNumberRecursion(--n);
        }
    }


    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static void factorialDemo1() {
        Scanner console = new Scanner(System.in);
        int num; // To hold number
        int fact = 1; // To hold factorial

        System.out.print("Enter any positive integer: ");
        num = console.nextInt();

        fact = factorialDemoRecursion(num);
        System.out.println("Factorial: " + fact);
    }

    private static int factorialDemoRecursion(int num) {
        if (num <= 1) {
            return 1;
        }else {
            return num * factorialDemoRecursion(--num);
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

        result = powerNumbersRecursion(base, power);
        System.out.println("Result: " + result);
    }

    private static int powerNumbersRecursion(int base, int power) {
        if (power == 0) {
            return 1;
        }else {
            return base * powerNumbersRecursion(base, --power);
        }
    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static void reverseNumber() {
        Scanner console = new Scanner(System.in);

        int number;
        int reverse = 0;

        System.out.print("Enter the number ");
        number = console.nextInt();

        int temp = number;
        int remainder = 0;
        reverse = reverseNumberRecursion(number, remainder);
        System.out.println("Reverse of " + number + " is " + reverse);
    }

    private static int reverseNumberRecursion(int number, int remainder) {
        if (number < 10){
            return remainder * 10 + number;
        }else {
            return reverseNumberRecursion(number / 10, remainder * 10 + number % 10);
        }
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

        boolean flag = true;

        flag = testPrimeRecursion(number, --number);
        if (flag) {
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }

    }

    private static boolean testPrimeRecursion(int number, int temp) {
        if (temp == 1) {
            return true;
        }else if (number % temp == 0) {
            return false;
        }else {
            return testPrimeRecursion(number, --temp);
        }
    }
}


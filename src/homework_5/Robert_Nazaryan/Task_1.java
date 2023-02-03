package homework_5.Robert_Nazaryan;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
//        printNumbers(10);            // Question 1 -> try with different integer values instead of 10 only
//       sumNumbers();                // Question 2
       factorialDemo1();            // Question 3
//        powerDemo();                 // Question 4
//        reverseNumber();             // Question 5
//        testPrime();                 // Question 6
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        if (count == 0) {
            return;
        }
        System.out.print(count + " ");
        printNumbers(--count);
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static void sumNumbers() {
        int sum = 0;
        sum = sumNumbersRecursion(10);
        System.out.println("Sum: " + sum);
    }

    private static int sumNumbersRecursion(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumNumbersRecursion(--n);
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

        fact = factorialDemo1Recursion(num);

        System.out.println("Factorial: " + fact);
    }

    private static int factorialDemo1Recursion(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorialDemo1Recursion(--n);
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

        result = powerDemoRecursion(base, power);
        System.out.println("Result: " + result);
    }

    private static int powerDemoRecursion(int b, int p) {
        if (p == 0) {
            return 1;
        }
        return b * powerDemoRecursion(b, --p);
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

    private static int reverseNumberRecursion(int n, int r) {
        if (n < 10) {
            return r * 10 + n;
        }
        return reverseNumberRecursion(n / 10, r * 10 + n % 10);
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
        } else {
            System.out.println("Not Prime");
        }
    }

    private static boolean testPrimeRecursion(int num, int temp) {
        if (temp == 1) {
            return true;
        } else if (num % temp == 0) {
            return false;
        } else {
            return testPrimeRecursion(num, --temp);
        }

    }
}


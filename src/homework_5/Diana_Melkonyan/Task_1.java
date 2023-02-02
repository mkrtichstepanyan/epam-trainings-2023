package homework_5.Diana_Melkonyan;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        //   printNumbers(10);      // Question 1 -> try with different integer values instead of 10 only
        //   sumNumbers();           // Question 2
//    factorialDemo1();       // Question 3
//    powerDemo();            // Question 4
        //       reverseNumber();        // Question 5
        //   readSetIntegers();      // Question 6
    testPrime();            // Question 7
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        // Todo write your code here ...
        if (count == 0)
            return;
        printNumbers(count - 1);
        System.out.println(count);
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static void sumNumbers() {
        int sum = 0;
        //
        int number = 10;
        sum = sumNumbers(number);
        System.out.println(sum);
    }

    private static int sumNumbers(int n) {
        if (n <= 1)
            return n;
        return n + sumNumbers(n - 1);

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

        // Todo write your code here ...

        fact = factorialDemo1Rec(num);
        System.out.println("Factorial: " + fact);
    }

    private static int factorialDemo1Rec(int n) {

        if (n <= 1) return 1;
        return n * factorialDemo1Rec(n - 1);
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

        // Todo write your code here ...
        result = powerDemoRec(base, power);
        System.out.println("Result: " + result);
    }

    private static int powerDemoRec(int base, int power) {
        if (power != 0) {
            return base * powerDemoRec(base, power - 1);
        } else {
            return 1;
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

        // Todo write your code here ...
        reverse = reversNumberRec(number, reverse);

        System.out.println("Reverse of " + number + " is " + reverse);
    }

    private static int reversNumberRec(int num, int r) {
        if (num == 0) {
            return r;
        } else {
            int remainder = num % 10;
            r = r * 10 + remainder;
            return reversNumberRec(num / 10, r);
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
        // Todo write your code here ...

        if (testPrimeRec(number,number/2)) {
            System.out.println(number + " is prime number" + " " + flag);
        } else {
            System.out.println(number + " is a non-prime number");
        }
    }

    private static boolean testPrimeRec(int num, int i) {

        if (i == 1) {
            return true;
        } else if (num % i == 0) {
            return false;
        }
        else{
            return testPrimeRec(num, i-1 );
        }

    }
}


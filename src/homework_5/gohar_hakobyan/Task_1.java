package homework_5.gohar_hakobyan;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
//        printNumbers(10);            // Question 1 -> try with different integer values instead of 10 only
//        sumNumbers(10);                // Question 2
//        factorialDemo1();            // Question 3
//        powerDemo();                 // Question 4
//        reverseNumber();             // Question 5
//        testPrime();                 // Question 6
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        // Todo write your code here ...{
        if (count > 0) {
            printNumbers(count - 1);
            System.out.print(count + ", ");
        }
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static int sumNumbers(int num) {
        // Todo write your code here ...
        if (num != 0) {
            return num + sumNumbers(num - 1);
        } else {
            return num;
        }
    }


    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static int factorialDemo1() {
        Scanner console = new Scanner(System.in);
        int num; // To hold number
        int fact = 1; // To hold factorial

        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
        // Todo write your code here ...
        fact = findFactorial(num);
        System.out.println("The factorial of " + num + " is " + fact);
        return fact;
    }

    //This method for find the factorial of number.
    private static int findFactorial(int num) {
        return (num == 0) ? 1 : (num * findFactorial(num - 1));
    }


     /* TODO: Question 4
         Two numbers are entered through the keyboard.
         Write a program to find the value of one number raised to the power of another.
         (Do not use Java built-in method)
     */

    public static int powerDemo() {
        Scanner console = new Scanner(System.in);

        int base;
        int power;
        int result = 1;

        System.out.print("Enter the base number ");
        base = console.nextInt();

        System.out.print("Enter the power ");
        power = console.nextInt();

        // Todo write your code here ...
        result = findRaisedValue(base, power);
        System.out.println("Result: " + result);
        return result;
    }

    private static int findRaisedValue(int base, int power) {
        return (power != 0) ? (base * (findRaisedValue(base, power - 1))) : 1;
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

        // Todo write your code here ...
        reverse = reverseDigit(number, reverse);
        System.out.println("Reverse of " + number + " is " + reverse);
    }

    private static int reverseDigit(int num, int reverse) {
        if (num == 0) {
            return reverse;
        } else {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            return reverseDigit(num / 10, reverse);
        }
    }

    /* TODO: Question 6
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */
    public static void testPrime() {
        Scanner console = new Scanner(System.in);
        int number;
        int divisor = 2;

        // Todo write your code here ...
        System.out.print("Enter the positive integer ");
        number = console.nextInt();
        if (isPrime(number, divisor)) {
            System.out.print(number + " its a prime");
        } else {
            System.out.println(number + " its not a prime");
        }
    }

    private static boolean isPrime(int number, int divisor) {
        if (number == divisor) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return isPrime(number, divisor + 1);
    }
}


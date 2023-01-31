package homework_5.Ani_Barseghyan;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        printNumbers(10);            // Question 1 -> try with different integer values instead of 10 only
        sumNumbers();                // Question 2
        factorialDemo1();            // Question 3
        powerDemo();                 // Question 4
        reverseNumber();             // Question 5
        testPrime();                 // Question 6
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        // Todo write your code here ...

        if (count > 0) {
            printNumbers(count - 1);
            System.out.print(count + ", ");
        } else {
            System.out.println("Number is less than 1");
        }
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static void sumNumbers() {
        int sum;
        // Todo write your code here ...

        sum = sumNumberRec(10);

        System.out.println("Sum: " + sum);
    }

    private static int sumNumberRec(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumNumberRec(--n);
    }


    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static void factorialDemo1() {
        Scanner console = new Scanner(System.in);
        int num; // To hold number
        int fact; // To hold factorial

        // Todo write your code here ...

        do {
            System.out.print("Enter any positive integer: ");
            num = console.nextInt();
        } while (num < 0);

        fact = calculateFactorial(num);

        System.out.println("Factorial: " + fact);
    }

    private static int calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * calculateFactorial(--num);
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

        // Todo write your code here ...

        result = powerRec(base, power);

        System.out.println("Result: " + result);
    }

    private static int powerRec(int base, int power) {
        int result = 1;
        if (power == 0) {
            return result;
        }
        return base * powerRec(base, --power);
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

        int remainder = 0;

        // Todo write your code here ...

        reverse = reverseNumberRec(number, remainder);

        System.out.println("Reverse of " + number + " is " + reverse);
    }

    private static int reverseNumberRec(int number, int remainder) {
        if (number < 10) {
            return remainder * 10 + number;
        }
        return reverseNumberRec(number / 10, remainder * 10 + number % 10);
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

        // Todo write your code here ...

        flag = testPrimeRec(number, number / 2);

        if (flag) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }

    private static boolean testPrimeRec(int number, int i) {
        if (i == 1) {
            return true;
        } else if (number % i == 0) {
            return false;
        } else {
            return testPrimeRec(number, --i);
        }
    }
}


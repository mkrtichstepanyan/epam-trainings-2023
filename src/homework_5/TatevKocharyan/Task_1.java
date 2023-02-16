package homework_5.TatevKocharyan;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
//        printNumbers(10);                                        // Question 1 -> try with different integer values instead of 10 only
//        int sum=sumNumbers(5);System.out.println(sum);           // Questionn2
//        int fact = factorialDemo1(5);System.out.println(fact);   // Question 3
//        powerDemo();                                             // Question 4
//        reverseNumber();                                         // Question 5
//        testPrime();                                             // Question 6
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        if (count == 0) {
            return;
        }
        printNumbers(count - 1);
        System.out.println(count);
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static int sumNumbers(int number) {
        if (number != 0) {
            return number + sumNumbers(number - 1);
        } else return number;
    }


    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static int factorialDemo1(int num) {
        if (num == 0) {
            return 1;
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

        if (power != 0) {
            result = powerDemoRecursion(base, power);
        }

        System.out.println("Result: " + result);
    }

    private static int powerDemoRecursion(int base, int power) {
        if (power > 0) {
            return base * powerDemoRecursion(base, power - 1);
        } else if (power == 0) {
            return 1;

        }
        return 0;
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

        reverse = reverseNumberRecursion(number, reverse);

        System.out.println("Reverse of " + number + " is " + reverse);
    }

    private static int reverseNumberRecursion(int number, int reverse) {
        if (number == 0) {
            return reverse;
        }
        int remainder = number % 10;
        reverse = reverse * 10 + remainder;
        return reverseNumberRecursion(number / 10, reverse);
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

        boolean flag = false;
        int i;
        flag = testPrimeRecursion(number, i = 2);
        System.out.println("The " + number + " is prime: " + flag);
    }

    private static boolean testPrimeRecursion(int number, int i) {
        if (number % i == 0 && i != number) {
            return false;
        }
        if (number == 2) {
            return true;
        }

        if (number <= i) {
            return false;
        }
        return testPrimeRecursion(number, i + 1);
    }
}


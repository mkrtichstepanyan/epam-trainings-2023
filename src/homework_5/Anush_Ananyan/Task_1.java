package homework_5.Anush_Ananyan;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
//        printNumbers(7);            // Question 1 -> try with different integer values instead of 10 only
//        System.out.println(sumNumbers(10));                // Question 2
//        System.out.println(factorialDemo1(7));             // Question 3
//        System.out.println(powerDemo(-2, 3));              // Question 4
//        System.out.println(reverseNumber(4256)) ;          // Question 5
//        System.out.println(testPrime(9));                  // Question 6
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {

        if (count <= 0) {
            System.out.println("Enter the positive number");
        } else {
            printNumbers(count - 1);
            System.out.println(count);
        }
    }


    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static int sumNumbers(int number) {
        int sum = 0;
        if (number <= 0) {
            System.out.println("Enter the positive number");
        } else if (number == 1) {
            return sum = 1;
        } else {
            sum = number + sumNumbers(number - 1);
        }
        return sum;
    }


    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static int factorialDemo1(int num) {

        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorialDemo1(num - 1);
    }


     /* TODO: Question 4
         Two numbers are entered through the keyboard.
         Write a program to find the value of one number raised to the power of another.
         (Do not use Java built-in method)
     */

    public static int powerDemo(int base, int power) {

        if (power == 1) {
            return base;
        } else {
            return base * powerDemo(base, power - 1);
        }
    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static int reverseNumber(int number) {
        return reverseNumber1(number, 0);
    }
    private static int reverseNumber1(int number, int reverse) {
        int reminder = 0;
        if (number != 0) {
            reminder = number % 10;
            reverse = reverse * 10 + reminder;
            return (reverseNumber1(number / 10, reverse));
        } else {
            return reverse;
        }
    }


    /* TODO: Question 6
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */
    public static boolean testPrime(int number) {
        return prime(number, 2);
    }
    private static boolean prime(int number, int num) {
        if (number <= 2) {
            return true;
        } else if (number % num == 0) {
            return false;
        }
        if (num*num > number) {
            return true;
        } else {
            return (prime(number, num+1));
        }
    }
}


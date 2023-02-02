package homework_5.Ofelya_Khachatryan;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
//        printNumbers(10);            // Question 1 -> try with different integer values instead of 10 only
//        System.out.println(sumNumbers(10));                // Question 2
//        System.out.println(factorialDemo1(5) );            // Question 3
//        System.out.println(powerDemo(2,3));                // Question 4
//        reverseNumber(987654);                             // Question 5
        //       System.out.println(testPrime(5));                  // Question 6
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        // Todo write your code here ...
        if (count <= 0) {
            return;
        }
        printNumbers(count - 1);
        System.out.print(count + " ");
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static int sumNumbers(int number) {

        // Todo write your code here ...
        if (number == 1) {
            return 1;
        } else {
            return sumNumbers(number - 1) + number;
        }
    }


    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static int factorialDemo1(int num) {
        int fact = 1; // To hold factorial


        // Todo write your code here ...
        if (num == 0 || num == 1) {
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

    public static int powerDemo(int base, int power) {

        int result = 1;

        // Todo write your code here ...

        if (power != 0) {
            return base * powerDemo(base, power - 1);
        } else {
            return 1;
        }

    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static void reverseNumber(int number) {

        int reverse = 0;
        int temp = number;
        int remainder = 0;

        // Todo write your code here ...
        if (number < 10) {
            System.out.println(number);
            return;
        } else {
            remainder = number % 10;
            System.out.print(remainder);
            reverseNumber(number / 10);
        }
    }


    /* TODO: Question 6
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */
    public static boolean testPrime(int number) {

        boolean flag = true;

        // Todo write your code here ...
        if (number <= 1) {
            return false;
        }
        if (number % 2 == 0) {

            return false;
        } else {
            testPrime(number % 3);
        }
        return flag;
    }
}

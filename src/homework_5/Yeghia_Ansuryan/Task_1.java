package homework_5.Yeghia_Ansuryan;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
//        printNumbers(-10);                       // Question 1 -> try with different integer values instead of 10 only
//          System.out.println(sumNumbers(9));    // Question 2
//        System.out.println(factorialDemo1(5)); // Question 3
//        System.out.println(powerDemo(3, 8));   // Question 4
//            reverseNumber(5625);               // Question 5
//       System.out.println(testPrime(4)); // Question 6
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        if (count <= 0) {

            System.out.println("The number must be positive");
            return;

        } else if (count >= 2) {
            printNumbers(count - 1);
        }
        System.out.print(count + " ");

    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static int sumNumbers(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return sumNumbers(number - 1) + number;
        }
    }


    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static int factorialDemo1(int number) {
        if (number <= 0 || number <= 1) {
            return 1;
        } else {
            return number * factorialDemo1(number - 1);
        }

    }

     /* TODO: Question 4
         Two numbers are entered through the keyboard.
         Write a program to find the value of one number raised to the power of another.
         (Do not use Java built-in method)
     */

    public static int powerDemo(int base, int power) {
        if (power == 0) {
            return 1;
        } else {
            return base * powerDemo(base, power - 1);
        }

    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */
     public static int reverseNumber(int number) {
         return (reverseNumberDemo(number, 0));
     }

    private static int reverseNumberDemo(int number, int reverse) {
        int remainder = 0;
        if (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            return (reverseNumberDemo(number / 10, reverse));
        } else {
            System.out.println(reverse);
            return 0;
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
        if (num * num > number) {
            return true;
        } else {
            return (prime(number, num + 1));
        }
    }
}

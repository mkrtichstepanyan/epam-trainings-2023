package homework_5.Armen_Martirosyan;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        printNumbers(10); //Question 1 -> try with different integer values instead of 10 only
        System.out.println();
        System.out.println(sumNumbers(10));                // Question 2
        System.out.println(factorialDemo1(5));            // Question 3
        System.out.println(powerDemo(6, 3));                 // Question 4
        System.out.println(reverseNumber(123456, 0));             // Question 5
        System.out.println(testPrime(5, 2));                 // Question 6
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */

    public static void printNumbers(int count) {
        if (count <= 0) {
            System.out.println("The count is less more then 0:");
        } else {
            printNumbers(count - 1);
            System.out.print(count + ", ");
        }
    }


    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static int sumNumbers(int number) {
        if (number == 1) {
            return 1;
        }
        return sumNumbers(number - 1) + number;
    }

    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static int factorialDemo1(int resualt) {
        if (resualt == 0 || resualt == 1) {
            return 1;
        }
        return resualt * factorialDemo1(resualt - 1);
    }

     /* TODO: Question 4
         Two numbers are entered through the keyboard.
         Write a program to find the value of one number raised to the power of another.
         (Do not use Java built-in method)
     */

    public static int powerDemo(int base, int power) {
        if (base == 0 || power == 0) {
            return 1;
        }
        return base * powerDemo(base, power - 1);
    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static int reverseNumber(int number, int reverse) {
        if (number == 0) {
            return reverse;
        }
        return reverseNumber(number / 10, (reverse * 10 + number % 10));
    }

    /* TODO: Question 6
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */
    public static boolean testPrime(int number, int i) {
        if (number <= 2) {
            return (number != 2) ? false : true;
        }
        if (i < number) {
            if (number % i == 0) {
                return false;
            } else {
                return testPrime(number, i+1);
            }
        }
        return true;
    }
}


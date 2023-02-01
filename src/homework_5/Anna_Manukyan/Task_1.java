package homework_5.Anna_Manukyan;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        System.out.println("Print number from 1 to given parameter");
        printNumbers(10, 1);            // Question 1 -> try with different integer values instead of 10 only

        System.out.println("Calculate the sum of first 10 natural numbers");
        int numberSum = sumNumbers(10);// Question 2 +
        System.out.println("Sum is " + numberSum);

        Scanner console = new Scanner(System.in);

        System.out.print("Enter any positive integer: ");
        int num = console.nextInt();
        while (num < 0) {
            System.out.println("Please enter positive number");
            num = console.nextInt();
        }
        int calculateFactorial = factorialDemo1(num);// Question 3 +
        System.out.println("Factorial: " + calculateFactorial);


        System.out.print("Enter the base number ");
        int base = console.nextInt();
        System.out.print("Enter the power ");
        int power = console.nextInt();
        while (power < 0) {
            System.out.println("Power can not be negative ");
            power = console.nextInt();
        }
        int resultOfNumberPower = powerDemo(base, power);// Question 4+
        System.out.println("Result: " + resultOfNumberPower);

        System.out.print("Enter the number ");
        int number = console.nextInt();
        System.out.print("Reverse of number is ");
        reverseNumber(number);             // Question 5+

        System.out.print("Enter the number ");
        int primeNumber = console.nextInt();
        System.out.println(testPrime(primeNumber, 2));                 // Question 7+
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count, int start) {
        if (count == 0) {
            return;
        }
        if (start > count) {
            return;
        } else {
            System.out.println(start);
            printNumbers(count, ++start);
        }
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static int sumNumbers(int size) {
        int sum = 0;
        if (size == 0) {
            return 0;
        } else {
            sum = sumNumbers(size - 1) + size;
        }
        return sum;
    }


    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static int factorialDemo1(int num) {
        int fact = 1; // To hold factorial
        if (num == 0 || num == 1) {
            return 1;
        }
        fact = factorialDemo1(num - 1) * num;
        return fact;
    }

     /* TODO: Question 4
         Two numbers are entered through the keyboard.
         Write a program to find the value of one number raised to the power of another.
         (Do not use Java built-in method)
     */

    public static int powerDemo(int base, int power) {
        int result = 1;
        if (power == 0) {
            return 1;
        }
        result = powerDemo(base, power - 1) * base;
        return result;
    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static void reverseNumber(int number) {
        if (number < 10) {
            System.out.println(number);
        } else {
            System.out.print(number % 10);
            reverseNumber(number / 10);
        }
    }


    /* TODO: Question 6
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */
    public static boolean testPrime(int number, int i) {

        if (number <= 0) {
            System.out.println("Please enter the positive integer ");
            System.out.println(number + "  isn't positive");
        }
        boolean flag = true;
        while (i < number) {
            if (number % i == 0) {
                flag = false;
                return flag;
            } else {
                i++;
                return testPrime(number, i);
            }
        }
        return flag;
    }
}


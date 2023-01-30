package homework_5.garik_gharibyan;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
//        printNumbers(37);            // Question 1 -> try with different integer values instead of 10 only
        System.out.println(sumNumbers(9));                // Question 2
//        factorialDemo1();            // Question 3
//        powerDemo();                 // Question 4
//        reverseNumber();             // Question 5
//        readSetIntegers();           // Question 6
//        testPrime();                 // Question 7
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {

        if (count <= 0) {
            System.out.println("invalid number");
        } else if (count == 1) {
            System.out.print(1 + " ");
        } else {
            printNumbers(--count);
            System.out.print(count + 1 + " ");
        }
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static int sumNumbers(int count) {
        int sum = 0;
        if (count == 0){
        }else {
            sum  =sumNumbers(count-1)+count;

        }

        return sum;
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

        System.out.println("Factorial: " + fact);
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

        System.out.println("Result: " + result);
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

        System.out.println("Reverse of " + number + " is " + reverse);
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

    }
}


package homework_3.TatevKocharyan.tasks;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

//        printNumbers(10);            // Question 1 -> try with different integer values instead of 10 only
//        sumNumbers(2);               // Question 2
//        table();                     // Question 3
//        factorialDemo1();            // Question 4
//        powerDemo();                 // Question 5
//        reverseNumber();             // Question 6
//        readSetIntegers();           // Question 7
//       testPrime();                 // Question 8
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        // Todo write your code here ...
        for (int i = 0; i <= count; i++) {
            System.out.println(i);
        }
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static void sumNumbers(int number) {
        int sum = 0;
        // Todo write your code here ...
        for (int i = 0; i <= number; i++) {
            sum = i + sum;
        }
        System.out.println("Sum: " + sum);
    }


    /* TODO: Question 3
        Write a program that prompts the user to input a positive integer.
        It should then print the multiplication table of that number.
    */
    public static void table() {
        Scanner console = new Scanner(System.in);
        int num;

        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
        // Todo write your code here ...
        if (num < 0) {
            System.out.println("The number you have entered is invalid. Please try again.");
        }
        System.out.println("Multiplication Table of " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + num * i);
        }
    }


    /* TODO: Question 4
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
        for (int i = 0; i < power; i++) {
            result = base * result;
        }
        System.out.println("Result: " + result);
    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static void reverseNumber() {
        Scanner console = new Scanner(System.in);

        int number;// for example 456
        int reverse = 0;

        System.out.print("Enter the number ");
        number = console.nextInt();

        int temp = number;
        int remainder = 0;

        // Todo write your code here ...
        while (number != 0) {
            remainder = number % 10;//6//5
            reverse = reverse * 10 + remainder;//6//5
            number = number / 10;//45//4
        }

        System.out.println("Reverse of " + number + " is " + reverse);
    }

    /* TODO: Question 6
         Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
    */

    public static void readSetIntegers() {
        Scanner console = new Scanner(System.in);

        int number;
        char choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.print("Enter the number ");
            number = console.nextInt();

            // Todo write your code here ...
            for (int i = 1; i <= number; i++) {
                System.out.print(i);
            }

            System.out.print("\nDo you want to continue y/n? ");
            choice = console.next().charAt(0);
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    evenSum = evenSum + i;
                } else oddSum = oddSum + i;
            }

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

    }

    /* TODO: Question 7
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
        if (number < 2) {
            flag = false;
        } else flag = true;
        for (int i = 2; i < number / i; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Prime");
        } else System.out.println("Not Prime");

    }
}
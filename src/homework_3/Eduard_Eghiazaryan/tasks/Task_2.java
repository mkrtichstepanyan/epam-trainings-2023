package homework_3.Eduard_Eghiazaryan.tasks;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
//        printNumbers(10);      // Question 1 -> try with different integer values instead of 10 only
//        sumNumbers();                // Question 2
//        table();                     // question 3
//        factorialDemo1();            // Question 4
//        powerDemo();                 // Question 5
//        reverseNumber();             // Question 6
//        readSetIntegers();           // Question 7
//        testPrime();                 // Question 8
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        for (int i = 1; i <= count ; i++) {
            if (i != count) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println();
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static void sumNumbers() {
        int sum = 0;
        int a = 10;

        for (int i = 1; i <= a; i++) {
            sum += i;
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

        System.out.println("Multiplication Table of " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }

    }

    /* TODO: Question 4
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static void factorialDemo1() {
        Scanner console = new Scanner(System.in);
        int num;
        int fact = 1;

        System.out.print("Enter any positive integer: ");
        num = console.nextInt();

        for (int i = 1; i <= num; i++){
            fact *= 1;
        }

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

        for (int i = 0; i < power; i++){
            result *= base;
        }
        System.out.println(base + " ^ " + power + " = " + result);
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

       while (temp != 0){
           remainder = temp % 10;
           temp = temp / 10;
           reverse = reverse * 10 + remainder;

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

            if (number % 2 == 0){
                evenSum += number;
            }else {
                oddSum += number;
            }
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

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
        do {
            System.out.print("Enter a positive integer: ");
            number = console.nextInt();
        } while (number <= 0);
        boolean flag = true;
        if (number == 1) {
            flag = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}



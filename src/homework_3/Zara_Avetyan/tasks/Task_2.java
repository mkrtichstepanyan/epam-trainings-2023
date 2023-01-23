package homework_3.Zara_Avetyan.tasks;

import java.util.Scanner;

public class Task_2 {


    public static void main(String[] args) {
        printNumbers(10);      // Question 1 -> try with different integer values instead of 10 only
        sumNumbers();                // Question 2
        table();
        factorialDemo1();            // Question 3
        powerDemo();                 // Question 4
        reverseNumber();             // Question 5
        readSetIntegers();           // Question 6
        testPrime();                 // Question 7
    }

    public static void printNumbers(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println(i);
        }
    }

    public static void sumNumbers() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }

    public static void table() {
        Scanner console = new Scanner(System.in);
        int num;
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
        System.out.println("Multiplication Table of " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + i * num);
        }
    }

    public static void factorialDemo1() {
        Scanner console = new Scanner(System.in);
        int num; // To hold number
        int fact = 1; // To hold factorial
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }

    public static void powerDemo() {
        Scanner console = new Scanner(System.in);
        int base;
        int power;
        int result = 1;
        System.out.print("Enter the base number ");
        base = console.nextInt();
        System.out.print("Enter the power ");
        power = console.nextInt();
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        System.out.println("Result: " + result);
    }

    public static void reverseNumber() {
        Scanner console = new Scanner(System.in);
        int number;
        int reverse = 0;
        System.out.print("Enter the number ");
        number = console.nextInt();
        int temp = number;
        int remainder = 0;
        while (temp > 0) {
            temp /= 10;
            remainder++;
        }
        for (int i = 0; i < remainder; i++) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        System.out.println("Reverse of your number is " + reverse);
    }

    public static void readSetIntegers() {
        Scanner console = new Scanner(System.in);
        int number;
        char choice;
        int evenSum = 0;
        int oddSum = 0;
        do {
            System.out.print("Enter the number ");
            number = console.nextInt();
            if (number % 2 == 0) evenSum += number;
            else oddSum += number;
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }

    public static void testPrime() {
        Scanner console = new Scanner(System.in);
        int number;
        System.out.print("Enter the positive integer ");
        number = console.nextInt();
        boolean flag = true;
        for (int i = 2; i < number / i; i++) {
            if (number % i == 0) flag = false;
            if (!flag) break;
        }
        if (flag) System.out.println(number + " is prime");
        else System.out.println(number + " is not prime");
    }
}
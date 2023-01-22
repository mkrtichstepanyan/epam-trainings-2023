package Vardan_Mkrtchyan.tasks;
import java.util.Scanner;
public class task_2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.printf("Enter number: ");
        int num = a.nextInt();


        printNumbers(num);          // Question 1 -> try with different integer values instead of 10 only
        sumNumbers(num);            // Question 2
        factorialDemo1(num);        // Question 3
        table();
        powerDemo();                // Question 4
        reverseNumber();            // Question 5
        readSetIntegers();          // Question 6
        testPrime();                // Question 7
    }

    public static void table() {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter any positive integer: ");
        int num = console.nextInt();

        System.out.println("Multiplication Table of " + num);
        for (int i = 1; i <= 10; i++) System.out.println(num + " * " + i + " = " + (num * i));


    }
    public static void printNumbers(int count) {
        for(int i = 1; i <= count; i++) System.out.print(i + ", ");

    }

    public static void sumNumbers(int x) {
        int sum = 0;
        for(int i = 1; i <= x; i++) sum += i;

        System.out.print("Sum: " + sum + ", ");

    }
    public static void factorialDemo1(int x) {
        int fact = 1; // To hold factorial
        for(int i = 1; i <= x; i++) fact = fact * i;

        System.out.println("Factorial: " + fact);
    }
    public static void powerDemo() {
        Scanner console = new Scanner(System.in);

        System.out.printf("base: ");
        int base = console.nextInt();
        System.out.printf("power: ");
        int power = console.nextInt();

        int result = 1;

        for(int i = 1; i <= power; i++) result = result * base;

        System.out.println("Result: " + result);
    }
    public static void reverseNumber() {
        Scanner console = new Scanner(System.in);

        System.out.printf("Enter number for reverse: ");
        int number = console.nextInt();
        int number2 = number;

        String reverse = "";
        int j = 1;

        while (number != 0){
            j = number % 10;
            reverse = reverse + Integer.toString(j);
            number /= 10;
        }
        System.out.println("Reverse of " + number2 + " is " + reverse);
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
            if(number % 2 == 0){
                evenSum += number;
            }
            else {
                oddSum += number;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
    public static void testPrime() {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the positive integer ");
        int number = console.nextInt();
        boolean flag = true;
        for(int i = 2; i <= number / 2; i++){
            if(number % i == 0){
                flag = false;
                break;
            }
        }

        if(flag) System.out.println(number + " is prime");
        else System.out.println(number + " is not prime");

    }

}

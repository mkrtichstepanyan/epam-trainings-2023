package homework_5.Liana_gevorgyan;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
   //   printNumbers(10);            // Question 1 -> try with different integer values instead of 10 only
   //     System.out.println("Sum: " + sumNumbers(4));                // Question 2
    //   factorialDemo1();            // Question 3
    //   powerDemo();                 // Question reverseNumber();             // Question 5

        testPrime();                 // Question 7
    }

    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        if (count == 1) {
            System.out.print(count + " ");
        } else {
            printNumbers(count - 1);
            System.out.print(count + " ");
        }
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static int sumNumbers(int count) {
        int sum = 0;
        if (count == 1) {
            sum = 1;
        } else {
            sum = sumNumbers(count - 1) + count;

        }
       // System.out.println(" sum " + sum);
        return sum;
    }


    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static void factorialDemo1() {
        Scanner console = new Scanner(System.in);
        int num; // To hold number

        System.out.print("Enter any positive integer: ");
        num = console.nextInt();

        // Todo write your code here ...

        System.out.println("Factorial: " + factorialRec(num));
    }
    public static int factorialRec(int number) {
        if (number == 1){
            return 1;
        }else{
            return factorialRec(number-1) * number;
        }

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

        System.out.print("Enter the base number ");
        base = console.nextInt();

        System.out.print("Enter the power ");
        power = console.nextInt();

        System.out.println("Result: " + powerRec(base,power));
    }
    public static int powerRec(int base, int power){
        if(power == 1){
            return base;
        }else {
            return powerRec(base, power-1)*base;
        }

    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static void reverseNumber() {
        Scanner console = new Scanner(System.in);

        int number;

        System.out.print("Enter the number ");
        number = console.nextInt();

        reverseRec(number);
    }
    private static void reverseRec(int number){
        if(number / 10 == 0){
            System.out.print(number);
        }else {
            System.out.print(number % 10);
            reverseRec(number / 10);
        }
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

       if (isPrimeRec(number,2 )){
           System.out.println(" The number is prime ");
       }else {
           System.out.println(" Number is not prime ");
       }

    }
    private static boolean isPrimeRec( int number, int divider){
        if (number==2){
            return true;
        }
        if (number % divider == 0  ) {
            return false;
        }else if (divider > number/2) {
            return true;
        }else {
            return isPrimeRec(number,divider + 1);
        }
    }
}



package homework_5.Varsik_Pijoyan;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
//        printNumbers(25);            // Question 1 -> try with different integer values instead of 10 only
//        sumNumbers();                // Question 2
//        factorialDemo1();            // Question 3
//        powerDemo();                 // Question 4
//        reverseNumber();             // Question 5
//        testPrime();                 // Question 6
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        if (count == 0)
            return;
        System.out.print(count + " ");
        printNumbers(count - 1);
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static void  sumNumbers() {
        int sum = 0;
        sum = sumNumbersRec(10);
        System.out.println("Sum: " + sum);
    }

    public static int sumNumbersRec(int i) {
        if (i == 0) {
            return 0;
        }else {
            return i + sumNumbersRec(i - 1);
        }
    }


    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static void factorialDemo1() {
        Scanner console = new Scanner(System.in);
        int num;
        int fact = 1; // To hold factorial

        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
        fact = factRecursion(num);
        System.out.println("Factorial: " + fact);
    }
    public static int factRecursion(int num ){
        if (num == 0) {
            return 1;
        }
        else {
            return (num * factRecursion(num - 1));
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
        int result = 1;

        System.out.print("Enter the base number ");
        base = console.nextInt();

        System.out.print("Enter the power ");
        power = console.nextInt();
        result = powerDemoRec(base, power);
        System.out.println("Result: " + result);
    }
    private  static int powerDemoRec(int b, int pwr){
        if (pwr == 0){
            return 1;
        }
        else {
            return b * powerDemoRec(--pwr, b );
        }
    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static void reverseNumber() {
        Scanner console = new Scanner(System.in);

        int number = 0;
        int reverse = 0;

        System.out.print("Enter the number ");
        number = console.nextInt();

        int temp = number;
        int remainder = 0;
        reverse = reverseNumberRec(number, remainder);

        System.out.println("Reverse of " + number + " is " + reverse);
    }

    private static int reverseNumberRec(int num, int reverseNum) {
        if(num < 10){
            return reverseNum * 10 + num;
        }
        return reverseNumberRec( num / 10 , reverseNum * 10 + num % 10);

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
        flag = testPrimeRec(number, number);
        if (!flag) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

    }
    private static boolean testPrimeRec(int inputNumber, int i) {
        if (i == 1) {
            return true;
        } else if (inputNumber % i == 0) {
            return false;
        } else {
            return testPrimeRec(inputNumber, --i);
        }
    }
}


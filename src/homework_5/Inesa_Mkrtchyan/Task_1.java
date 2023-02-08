package homework_5.Inesa_Mkrtchyan;
import java.util.Scanner;

public class Task_1 {
	public static void main(String[] args) {
//        printNumbers(10);            // Question 1 -> try with different integer values instead of 10 only
//        sumNumbers(5);                // Question 2
//        factorialDemo1(10);            // Question 3
//        powerDemo();                 // Question 4
//        reverseNumber(5);             // Question 5
//        testPrime();                 // Question 7
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        if (count == 1) {
            System.out.println(count);
            return;
        } else {
            System.out.println(count);
            printNumbers(count - 1);
        }
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static int sumNumbers(int a) {
        if (a == 1) return 1;
        return a + sumNumbers(a - 1);
    }


    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static int factorialDemo1(int a) {
        if (a == 0 || a == 1) return 1;
        return a * factorialDemo1(a - 1);
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
        System.out.println("Result: " + powerDemo(base, power));
    }
    public static int powerDemo(int base, int power) {
        if (power == 1) return base;
        return base * powerDemo(base, power - 1);
    }
     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static void reverseNumber(int num) {
        if (num < 10) {
            System.out.println(num);
        } else {
            System.out.print(num % 10);
            reverseNumber(num / 10);
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

        System.out.println(Prime(number,number-1));
    }
    public static boolean Prime(int num, int d) {
        if (d == 1) return true;
        if (num % d == 0) return false;

        return Prime(num, d - 1);
    }
}
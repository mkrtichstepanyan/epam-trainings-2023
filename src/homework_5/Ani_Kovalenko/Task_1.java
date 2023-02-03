package homework_5.Ani_Kovalenko;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
//        printNumbers(8);            // Question 1 -> try with different integer values instead of 10 only
//        System.out.println(sumNumbers(10));                // Question 2
//        System.out.println(factorialDemo1());            // Question 3
//        System.out.println(powerDemo());                 // Question 4
//        reverseNumber(5625);             // Question 5
        System.out.println(testPrime(7));                 // Question 6
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {

        if (count > 1) {
            printNumbers(count - 1);
        }
        System.out.println(count);
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static int sumNumbers(int num) {
        if (num == 0) {
            return 0;
        } else {
            int sum = sumNumbers(num - 1) + num;

            return sum;
        }

    }


    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static int factorialDemo1() {
        int num;
        int fact = 1;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
        return calculation(num);
    }

    public static int calculation(int num) {
        int fact = 1;
        if (num == 1) {
            return fact;
        } else {
            fact = calculation(num - 1) * num;
            return fact;
        }
    }
     /* TODO: Question 4
         Two numbers are entered through the keyboard.
         Write a program to find the value of one number raised to the power of another.
         (Do not use Java built-in method)
     */

    public static int powerDemo() {
        int base, power;
        Scanner console = new Scanner(System.in);
        int result = 1;

        System.out.print("Enter the base number ");
        base = console.nextInt();

        System.out.print("Enter the power ");
        power = console.nextInt();

        return basePowerCalculation(base, power);
    }

    public static int basePowerCalculation(int base, int power) {
        int result;
        if (power == 0) {
            return 1;
        } else {
            result = base * basePowerCalculation(base,power-1);
            return result;
        }
    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static int reverseNumber(int number) {
        return reverseCalculation(number, 0);
    }
    private static int reverseCalculation(int number, int reverse){
        int remainder = 0;
        if (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            return (reverseCalculation(number/10,reverse));
        }
            System.out.println(reverse);
            return 0;

    }





    /* TODO: Question 6
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */

    public static boolean testPrime (int number){
        if (number <= 1){
            return false;
        } else if (number % 2 ==0 && number != 2){
            return false;
        } else {
            testPrime(number -1);
            return true;
        }
    }
}

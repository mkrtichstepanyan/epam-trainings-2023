package homework_5.gevorg_arghushyan;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

//        printNumbers(10, 1);                                      // Question 1
//**********************************************************************************************************************
//        System.out.println(sumNumbers(10));                       // Question 2
//**********************************************************************************************************************
//        System.out.println("Enter any positive integer: ");       // Question 3
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        System.out.println(factorialDemo1(number));
//**********************************************************************************************************************
//        Scanner scanner = new Scanner(System.in);                 // Question 4
//        int base;
//        int power;
//        System.out.print("Enter the base number ");
//        base = scanner.nextInt();
//        System.out.print("Enter the power ");
//        power = scanner.nextInt();
//        System.out.println(powerDemo(base,power));
//**********************************************************************************************************************
        Scanner scanner = new Scanner(System.in);                    // Question 5
        System.out.print("Enter the number ");
        int number = scanner.nextInt();
        System.out.println(reverseNumber(number,0) );;
//**********************************************************************************************************************
//        readSetIntegers();                                        // Question 6
//        testPrime();                                              // Question 7

    }
    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count, int number) {
        System.out.println(number);
        if (number == count){
            return;
        }
        number++;
        printNumbers(count,number);
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
//    public static void sumNumbers(int number, int sum, int counter) {
//        if (counter == 0) {
//            System.out.println(sum);
//            return;
//        }
//        counter--;
//        number++;
//
//        sum = sum + number;
//        sumNumbers(number, sum, counter);
//    }
    public static int sumNumbers(int number) {
        if (number == 1){
            return 1;
        }
        return number + sumNumbers(number - 1);
    }


    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */

    public static int factorialDemo1(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorialDemo1(number - 1);
    }

     /* TODO: Question 4
         Two numbers are entered through the keyboard.
         Write a program to find the value of one number raised to the power of another.
         (Do not use Java built-in method)
     */

    public static int powerDemo(int base, int power) {
        if (power == 1) {
            return base;
        }
        return base * powerDemo(base, power-1);
    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static int reverseNumber(int number, int reverse) {
        if (number == 0){
            return reverse;
        }
        return reverseNumber(number / 10 , reverse * 10 + number % 10);
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


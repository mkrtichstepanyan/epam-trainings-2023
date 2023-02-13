package homework_5.Karen_Mikayelyan;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
//               printNumbers(10);            // Question 1 -> try with different integer values instead of 10 only
//               sumNumbers(3);                // Question 2
//               factorialDemo1();            // Question 3
//               powerDemo();                 // Question 4
//               reverseNumber();             // Question 5
               testPrime();                 // Question 6
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        if (count <= 0) {
            return;
        } else {
            printNumbers(count - 1);
            System.out.print(count + " ");
        }
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static int sumNumbers(int number) {
        int sum = calculateSumNumbers(number);

        System.out.println("Sum: " + sum);
        return sum;
    }

    private static int calculateSumNumbers(int num) {
        int sum = 0;

        if (num == 0) {
            return 0;
        } else {
            sum = calculateSumNumbers(num - 1) + num;
            return sum;
        }
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

        if (num >= 0) {
            fact = findFactorial(num);
            System.out.println("Factorial: " + fact);
        } else {
            System.out.println("The number is 'Negative', please try again!!!");
            factorialDemo1();
        }
    }

    private static int findFactorial(int n) {
        if (n > 0) {
            return n * findFactorial(n - 1);
        } else {
            return 1;
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

        if (power >= 0) {
            result = calculatePowerDemo(base, power);
        } else {
            System.out.println("Power number must be 'Positive' number");
            return;
        }
        System.out.println("Result: " + result);
    }

    private static int calculatePowerDemo(int baseNum, int powerNum) {
        if (powerNum == 0) {
            return 1;
        } else {
            return baseNum * calculatePowerDemo(baseNum, powerNum - 1);
        }
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

        reverse = calculateReverseNumber(number, reverse);

        System.out.println("Reverse of " + number + " is " + reverse);
    }

    private static int calculateReverseNumber(int num, int reverse) {
        if (num == 0) {
            return reverse;
        } else {
            int reminder = num % 10;
            reverse = reverse * 10 + reminder;
            return calculateReverseNumber(num / 10, reverse);
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

        boolean flag;

        flag = testOfPrime(number, 1);

        System.out.println("The " + number + " is prime : " + flag);
    }

    private static boolean testOfPrime(int num, int i) {
        if (num < 2) {
            return false;
        } else if (num == 2) {
            return true;
        } else if (i != num && num % i == 0) {
            return false;
        } else if (i > num) {
            return true;
        }
        return testOfPrime(num, i + 1);
    }
}



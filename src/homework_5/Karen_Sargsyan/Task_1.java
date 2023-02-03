package homework_5.Karen_Sargsyan;

public class Task_1 {

    public static void main(String[] args) {
//     printNumbers(10);                                        // Question 1 -> try with different integer values instead of 10 only
//     System.out.println("Sum: " + sumNumbers(3));             // Question 2
//     System.out.println("Factorial: " + factorialDemo1(5));   // Question 3
//     System.out.println(powerDemo(5, 2));                     // Question 4
//     reverseNumber(123);                                      // Question 5
//     System.out.println(testPrime(2));                        // Question 6
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        if (count == 0) {
            return;
        }
        printNumbers(count - 1);
        System.out.print(count + " ");
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static int sumNumbers(int sum) {
        if (sum >= 1) {
            return sum + sumNumbers(sum - 1);
        } else {
            return 0;
        }
    }

    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static int factorialDemo1(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorialDemo1(num - 1);
        }
    }

     /* TODO: Question 4
         Two numbers are entered through the keyboard.
         Write a program to find the value of one number raised to the power of another.
         (Do not use Java built-in method)
     */

    public static int powerDemo(int base, int power) {
        if (power == 0) {
            return 1;
        } else {
            return (base * powerDemo(base, power - 1));
        }
    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static int reverseNumber(int number) {
        return reverseNumberInternal(number, 0);
    }

    private static int reverseNumberInternal(int number, int reverse) {
        int remainder = 0;
        if (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            return (reverseNumberInternal(number / 10, reverse));
        } else {
            System.out.println("Reverse is " + reverse);
            return 0;
        }
    }

    /* TODO: Question 6
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */
    public static boolean testPrime(int number) {
        return Prime(number, 2);
    }

    private static boolean Prime(int number, int num) {
        if (number <= 2) {
            return true;
        } else if (number % num == 0) {
            return false;
        }
        if (num * num > number) {
            return true;
        } else {
            return (Prime(number, num + 1));
        }
    }
}

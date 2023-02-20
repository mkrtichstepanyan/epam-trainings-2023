package homework_5.Radik_Manasyan;

public class Task_1 {

    public static void main(String[] args) {
        printNumbers(24);            // Question 1 -> try with different integer values instead of 10 only
        System.out.println("\nSum: " + sumNumbers(-99));               // Question 2
        System.out.println("Sum: " + sumNumbers(99));               // Question 2
        System.out.println("Factorial: " + factorialDemo1(-4));            // Question 3
        System.out.println("Factorial: " + factorialDemo1(12));            // Question 3
        System.out.println("Factorial: " + factorialDemo1(-5));            // Question 3
        System.out.println("Resul: " + powerDemo(5, 4));                 // Question 4
        System.out.println("Revers numbers is " + reverseNumber(123450000));           // Question 5
        System.out.println("Revers numbers is " + reverseNumber(1234500005));           // Question 5
        System.out.println(testPrime(9));                 // Question 7
        System.out.print("Prime number: ");
        for (int i = 0; i < 101; i++) {
            if (testPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        if (count > 0) {
            printNumbers(count - 1);
            System.out.print(count + " ");
        } else if (count < 0) {
            System.out.print(count + " ");
            printNumbers(count + 1);
        } else {
            System.out.print(" 0 ");
        }
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static int sumNumbers(int digit) {
        int sum = 0;
        if (digit > 0) {
            sum = digit + sumNumbers(digit - 1);
        } else if (digit < 0) {
            sum = digit + sumNumbers(digit + 1);
        }
        return sum;
    }


    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static int factorialDemo1(int digit) {
        int fact = 1; // To hold factorial

        if (digit > 1) {
            fact = factorialDemo1(digit - 1);
        } else if (digit < -1) {
            fact = -factorialDemo1(digit + 1);
        }
        return fact * digit;
    }

     /* TODO: Question 4
         Two numbers are entered through the keyboard.
         Write a program to find the value of one number raised to the power of another.
         (Do not use Java built-in method)
     */

    public static int powerDemo(int base, int power) {
        int result = 1;

        if (power > 1) {
            result = powerDemo(base, power - 1);
        }
        return result * base;
    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static int reverseNumber(int number) {
        int reverse = 0;
        int countTen = 1;
        if (number != 0) {
            int remainder = number % 10;
            String s = String.valueOf(number);

            for (int i = 1; i < s.length(); i++) {
                countTen *= 10;
            }

            number = reverseNumber(number / 10) + (reverse + remainder) * countTen;
        }
        return number;
    }


    /* TODO: Question 6
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */
    public static boolean testPrime(int digit) {
        int number = digit / 2;
        boolean flag = true;
        if (digit <= 0) {
            return false;
        } else if (digit == 1 || digit == 2 || digit == 3) {
            return true;
        } else if (digit > 3) {
            for (int i = 2; i <= number; i++) {
                if (digit % i == 0) {
                    flag = false;
                    break;
                } else {
                    testPrime(digit - 1);
                }
            }
        }
        return flag;
    }
}

package homework_5.Nona_Asatryan;

public class Task_1 {

    public static void main(String[] args) {
//        printNumbers(10);            // Question 1 -> try with different integer values instead of 10 only
//        System.out.println("Sum: " + sumNumbers(7));                // Question 2
//        System.out.println("Factorial: " + factorialDemo1(3));            // Question 3
//        System.out.println("Result: " + powerDemo(4, 2));                 // Question 4
//        reverseNumber(12345435);             // Question 5
//        testPrime(6);                 // Question 7
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        if (count > 0) {
            printNumbers(count - 1);
            System.out.print(count + " ");
        }
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static int sumNumbers(int number) {
        if (number != 0) {
            return number + sumNumbers(number - 1);
        } else {
            return number;
        }
    }


    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static int factorialDemo1(int num) {
        if (num == 1) {
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
        if (power != 0) {
            return (base * powerDemo(base, power - 1));
        } else {
            return 1;
        }
    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static void reverseNumber(int number) {
        int reverse;
        int remainder = 0;
        reverse = reverseNumberUtil(number, remainder);
        System.out.println("Reverse of " + number + " is " + reverse);
    }
    private static int reverseNumberUtil(int number, int remainder) {
        if (number < 10) {
            return remainder * 10 + number;
        }
        return reverseNumberUtil(number / 10, remainder * 10 + number % 10);
    }

    /* TODO: Question 6
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */

    public static void testPrime(int number) {
        if (number <= 1) {
            System.out.println(number + " is not a prime number. " +
                    "Please, enter a whole number greater than 1.");
            return;
        }
        boolean flag = isPrime(number, number / 2);
        if (flag) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    private static boolean isPrime(int num, int divisor) {
        if (divisor == 1) {
            return true;
        } else if (num % divisor == 0) {
            return false;
        } else {
            return isPrime(num, --divisor);
        }
    }
}


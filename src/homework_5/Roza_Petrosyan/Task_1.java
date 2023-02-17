package homework_5.Roza_Petrosyan;

public class Task_1 {

    public static void main(String[] args) {
//        printNumbers(6);            // Question 1 -> try with different integer values instead of 10 only
//        System.out.println(sumNumbers(8));                // Question 2
//        System.out.println(factorialDemo1(2));             // Question 3
//        System.out.println(powerDemo(6,7));                // Question 4
//        System.out.println(reverseNumber(13428));         // Question 5
//        System.out.println(isPrime(9));                   // Question 6
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        if (count == 1) {
            System.out.print(count + " ");
            return;
        }

        printNumbers(count - 1);
        System.out.print(count + " ");
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */

    public static int sumNumbers(int number) {
        if (number == 1) {
            return 1;
        }
        return number + sumNumbers(number - 1);
    }


    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
//    public static int fact = 1;

    public static int factorialDemo1(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorialDemo1(num - 1);
    }

     /* TODO: Question 4
         Two numbers are entered through the keyboard.
         Write a program to find the value of one number raised to the power of another.
         (Do not use Java built-in method)
     */


    public static int powerDemo(int num, int pow) {
        if (pow != 0) {
            return (num * powerDemo(num, pow - 1));
        } else {
            return 1;
        }
    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static int reverseNumber(int number) {
        return innerReverseNumber(number, 0);
    }

    private static int innerReverseNumber(int number, int reverse) {
        if (number == 0) {
            return reverse;
        } else {
            reverse = reverse * 10 + number % 10;
            return innerReverseNumber(number / 10, reverse);
        }
    }


    /* TODO: Question 6
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */

    public static boolean isPrime(int number) {
        return isPrimeInternal(number, 3);
    }

    private static boolean isPrimeInternal(int n, int currDivisor) {
        if (n < 2 || n % currDivisor == 0) {
            return false;
        }

        if (n % 2 == 0) {
            return (n == 2);
        }

        if (currDivisor * currDivisor > n) {
            return true;
        }

        return isPrimeInternal(n, currDivisor + 2);
    }
}


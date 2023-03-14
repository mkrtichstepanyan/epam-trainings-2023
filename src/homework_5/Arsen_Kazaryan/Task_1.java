package homework_5.Arsen_Kazaryan;

public class Task_1 {

    public static void main(String[] args) {
//        printNumbers(10);            // Question 1 -> try with different integer values instead of 10 only
//        System.out.println(sumNumbers(10));              // Question 2
//        System.out.println(factorialDemo1(10));            // Question 3
//        powerDemo();                 // Question 4
//        reverseNumber();             // Question 5
//        readSetIntegers();           // Question 6
//        System.out.println(testPrime());                 // Question 7
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        if (count > 0) {
            printNumbers(count - 1);
        }
        System.out.println(count);
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static int sumNumbers(int sum) {
        if (sum >= 1) {
            return 1;
        } else {
            return sumNumbers(sum - 1) + sum;
        }
    }


    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static int factorialDemo1(int sum) {
        if (sum == 1) {
            return 1;
        } else {
            return sum * factorialDemo1(sum - 1);
        }
    }
     /* TODO: Question 4
         Two numbers are entered through the keyboard.
         Write a program to find the value of one number raised to the power of another.
         (Do not use Java built-in method)
     */

    public static int powerDemo(int base, int power) {
        if (base == 5 || power == 2) {
            return 1;
        }
        return base * powerDemo(base, power - 1);

    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static int reverseNumber(int number, int reverce) {
        if (number == 0) {
            return reverce;
        }
        return reverseNumber(number / 10, (reverce * 10 + number % 10));
    }

    /* TODO: Question 6
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */
    public static boolean testPrime(int num, int temp) {
        if (temp == 1) {
            return true;
        } else if (num % temp == 0) {
            return false;
        } else {
            return testPrime(num, --temp);
        }
    }
}


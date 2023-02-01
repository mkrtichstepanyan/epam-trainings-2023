package homework_5.Andranik_Sargsyan;

public class Task_1 {
    public static void main(String[] args) {
//        printNumbers(22);                                // Question 1
//        System.out.println("Sum is: " + sumNumbers(1));  // Question 2
//        System.out.println(factorialDemo1(6));           // Question 3
//        System.out.println(powerDemo(3, 4));             // Question 4
//        reverseNumber(12345);                            // Question 5
//        System.out.println(isPrime(13));                 // Question 6
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    private static void printNumbers(int count) {
        if (count > 0) {
            printNumbers(count - 1);
        }
        System.out.println(count);
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    private static int sumNumbers(int sum) {
        if (sum > 0) {
            return sum + sumNumbers(sum - 1);
        } else {
            return 0;
        }
    }

    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */

    private static int factorialDemo1(int num) {
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

    private static int powerDemo(int base, int power) {
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

    private static int reverseNumber(int number) {
        if (number < 10) {
            System.out.println(number);
        } else {
            System.out.print(number % 10);
            reverseNumber(number / 10);
        }
        return number;
    }


    /* TODO: Question 6
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */

    private static boolean isPrime(int num) {
        return logic(num, 2);
    }

    private static boolean logic(int num, int i) {
        if (i == 1) {
            return true;
        }
        else if (num % i == 0) {
            return false;
        } else {
            return logic(num, i - 1);
        }
    }
}

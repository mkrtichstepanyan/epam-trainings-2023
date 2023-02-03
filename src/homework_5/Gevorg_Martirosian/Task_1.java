package homework_5.Gevorg_Martirosian;

public class Task_1 {
    public static void main(String[] args) {
        printNumbers(10);            // Question 1 -> try with different integer values instead of 10 only
        System.out.println();
        int question_2 = sumNumbers(10);                // Question 2
        System.out.println(question_2);
        int question_3 = factorialDemo1(5);           // Question 3
        System.out.println(question_3);
        int question_4 = powerDemo(2, 5);                 // Question 4
        System.out.println(question_4);
        reverseNumber(12345);             // Question 5
        primeDemo(11);                 // Question 6
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        if (count <= 0) {
            return;
        }
        printNumbers(count - 1);
        System.out.print(count + " ");
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static int sumNumbers(int number) {
        if (number <= 0) {
            return number;
        }
        return number + sumNumbers(number - 1);
    }


    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static int factorialDemo1(int number) {

        if (number == 0) {
            return 1;
        } else {
            return (number * factorialDemo1(number - 1));
        }
    }

     /* TODO: Question 4
         Two numbers are entered through the keyboard.
         Write a program to find the value of one number raised to the power of another.
         (Do not use Java built-in method)
     */

    public static int powerDemo(int number, int power) {

        if (power == 0) {
            return 1;
        } else {
            return number * powerDemo(number, power - 1);
        }
    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static void reverseNumber(int number) {
        if (number < 10) {
            System.out.println(number);
        } else {
            System.out.print(number % 10);
            reverseNumber(number / 10);
        }
    }


    /* TODO: Question 6
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */
    private static boolean testPrime(int number, int i) {
        if (i == 1) {
            return true;
        }
        if (number % i == 0) {
            return false;
        }
        return testPrime(number, i - 1);
    }

    public static void primeDemo(int number){
        System.out.println(testPrime(number, number-1));
    }
}

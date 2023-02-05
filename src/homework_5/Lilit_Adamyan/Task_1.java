package homework_5.Lilit_Adamyan;

public class Task_1 {
    static int sum = 0;
    public static void main(String[] args) {

        printNumbers(10);

        int result = sumNumbers(5);
        System.out.println("\nSum of numbers is " + result);

        int result3 = factorialDemo1(5);
        System.out.println("Factorial of the number is " + result3);

        int base = 3;
        int power = 2;
        int result1 = powerDemo(base, power);
        System.out.println("\nResult is : " + result1);

        int number3 = 12345;
        System.out.print("The reversed digits of " + number3 + " are: ");
        reverseNumber(number3);

        int number4 = 12;
        boolean result2 = testPrime(number4, number4 / 2);
        if (result2) {
            System.out.println("\n" + number4 + " is a prime number");
        } else {
            System.out.println("\n" + number4 + " is not a prime number");
        }


    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        if (count <= 0) {
            System.out.println(count);
        } else {
            System.out.print(count + " ");
            printNumbers(count - 1);
        }

    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static int sumNumbers(int n) {

        if (n == 0) {
            return sum;
        } else {
            sum += n;
            sumNumbers(n - 1);
            return sum;
        }
    }

    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static int factorialDemo1(int n) {
        {
            if (n <= 1) {
                return 1;
            } else {
                return n * factorialDemo1(n - 1);
            }
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
            return base * (powerDemo(base, power - 1));
        }
    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    static void reverseNumber(int number) {
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
    public static boolean testPrime(int number, int divisor) {
        if (divisor == 1) {
            return true;
        } else if (number % divisor == 0) {
            return false;
        }
        return testPrime(number, divisor - 1);

    }
}


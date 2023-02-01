package homework_5.garik_gharibyan;


import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        printNumbers(37);                               // Question 1 -> try with different integer values instead of 10 only
        System.out.println("\n----------------------------");
        System.out.println(sumNumbers(9));                    // Question 2
        System.out.println("------------------------------");
        factorialDemo1();                                     // Question 3
        System.out.println("-------------------------------");
        System.out.println(powerDemo(-10, 3));  // Question 4
        System.out.println("-------------------------------");
        reverseNumber();                                      // Question 5
        System.out.println("--------------------------------");
        testPrime();                                          // Question 7
    }

    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {

        if (count <= 0) {
            System.out.println("invalid number");
        } else if (count == 1) {
            System.out.print(1 + " ");
        } else {
            printNumbers(--count);
            System.out.print(count + 1 + " ");
        }
    }


    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static int sumNumbers(int number) {
        int sum = 0;
        if (number<0){
            System.out.println("invalid number");
            return 0;
        } else if (number == 0) {
            return number;
        } else {
            sum = sumNumbers(number - 1) + number;
        }
        return sum;
    }


    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static int calculateFactorialDemo(int number) {

        int fact; // To hold factorial

        if (number < 0) {
            System.out.println("invalid number");
            return 0;
        } else if (number == 0 || number == 1) {
            return 1;
        }else {
            fact = calculateFactorialDemo(number - 1) * number;
        }
        return fact;
    }
    public static void factorialDemo1() {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int fact;

        fact = calculateFactorialDemo(number);
        System.out.println("Factorial: " + fact);

    }


     /* TODO: Question 4
         Two numbers are entered through the keyboard.
         Write a program to find the value of one number raised to the power of another.
         (Do not use Java built-in method)
     */
    public static int powerDemo(int number, int power) {
        int result;
        if (power < 0) {
            System.out.println("invalid power");
            return 0;
        } else if (power == 0) {
            return 1;
        } else if (power == 1) {
            return number;
        } else {
            result = powerDemo(number, power - 1)*number;
        }
        return result;
    }


     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */
    private static int reverse(int number,int revers){
        int result;
        if (number == 0){
            return revers;
        } else{
            int reminder = number % 10;
            revers = revers * 10 + reminder;
            result = reverse(number/10,revers);
        }
        return result;
    }
    public static void reverseNumber() {
        Scanner console = new Scanner(System.in);

        int number;

        System.out.print("Enter the number ");
        number = console.nextInt();

        int reverse = reverse(number, 0);


        System.out.println("Reverse of " + number + " is " + reverse);
    }


    /* TODO: Question 6
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */
    private static boolean isPrime(int number, int i) {
        boolean result;
        if (number <= 1) {
            return false;
        } else if (number==i) {
            return true;
        } else if (number % i == 0) {
            return false;
        } else {
            result = isPrime(number, ++i);
        }
        return result;
    }
    public static void testPrime() {
        Scanner console = new Scanner(System.in);
        int number;
        System.out.print("Enter the positive integer ");
        number = console.nextInt();

        boolean flag = isPrime(number,2);

        if (flag){
            System.out.println("number is prime");
        }else {
            System.out.println("number is not prime");
        }
    }
}


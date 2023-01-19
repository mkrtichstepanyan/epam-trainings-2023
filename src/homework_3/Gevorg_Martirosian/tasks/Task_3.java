package Gevorg_Martirosian.tasks;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
        System.out.println("-------------question 8--------------");
        FindHcf();                   // Question 8
        System.out.println("-------------question 9--------------");
        sumAgain();                  // Question 9
        System.out.println("-------------question 10--------------");
        countNumbers();              // Question 10
        System.out.println("-------------question 11--------------");
        findMaxMin();                // Question 11
        System.out.println("-------------question 12--------------");
        armstrongNumber();           // Question 12
        System.out.println("-------------question 13--------------");
        fibonacciSeries();           // Question 13
        System.out.println("-------------question 14--------------");
        sumOfSeries();               // Question 14
        System.out.println("-------------question 15--------------");
        guessMyNumber();             // Question 15
    }


    /* TODO: Question 8
        Write a program to calculate HCF of Two given number.
    */
    public static void FindHcf() {
        Scanner console = new Scanner(System.in);

        int dividend, divisor;
        int min, hcf = 1;

        System.out.print("Enter the first number ");
        dividend = console.nextInt();

        System.out.print("Enter the second number ");
        divisor = console.nextInt();

        if (dividend < divisor) {
            min = dividend;
        } else {
            min = divisor;
        }

        for (int i = min / 2; i >= 2; i--) {
            if (dividend % i == 0 && divisor % i == 0) {
                hcf = i;
                break;
            }
        }

        System.out.println("HCF: " + hcf);
    }


    /* TODO: Question 9
        Write a do-while loop that asks the user to enter two numbers.
        The numbers should be added and the sum displayed.
        The loop should ask the user whether he or she wishes to perform the operation again.
        If so, the loop should repeat; otherwise it should terminate.
    */

    public static void sumAgain() {
        Scanner console = new Scanner(System.in);

        int number1, number2;
        char choice;
        int sum = 0;
        do {
            System.out.println("enter the first number");
            number1 = console.nextInt();
            System.out.println("enter the second number");
            number2 = console.nextInt();
            sum += number1 + number2;
            System.out.println("sum: " + sum);

            System.out.print("do you want to perform the operation again y/n? ");
            choice = console.next().charAt(0);
            sum = 0;
        } while (choice == 'y' || choice == 'Y');
    }


    /* TODO: Question 10
        Write a program to enter the numbers till the user wants and at the end it should display the count of positive,
        negative and zeros entered.
    */

    public static void countNumbers() {
        Scanner console = new Scanner(System.in);

        int number, countPositive = 0, countNegative = 0, countZero = 0;

        char choice;

        do {
            System.out.print("Enter the number ");
            number = console.nextInt();

            if (number < 0) {
                countNegative++;
            } else if (number > 0) {
                countPositive++;
            } else {
                countZero++;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);
    }


     /* TODO: Question 11
         Write a program to enter the numbers till the user wants and
         at the end the program should display the largest and smallest numbers entered.
    */

    public static void findMaxMin() {
        Scanner console = new Scanner(System.in);

        int number;
        int max = Integer.MIN_VALUE;  // Intialize max with minimum value
        int min = Integer.MAX_VALUE;  // Intialize min with maximum value

        char choice;

        do {
            System.out.print("Enter the number ");
            number = console.nextInt();

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }


    /* TODO: Question 12
        Write a program to print out all Armstrong numbers between 1 and 500.
        If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
        For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
    */
    public static void armstrongNumber() {
        int nextDigit; //to hold each digit of the number
        int sum = 0; //sum of cubes of each digit of the number
        int currentNum; //current number for check
        System.out.print("all armstrong numbers between 1 and 500: ");
        for (int i = 0; i <= 500; i++) {
            currentNum = i;
            while (currentNum > 0) {
                nextDigit = currentNum % 10;
                sum += (nextDigit * nextDigit * nextDigit);
                currentNum = currentNum / 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
            sum = 0;
        }
        System.out.println();
    }


    /* TODO: Question 13
        Write a program to print Fibonacci series of n terms where n is input by user :
        0 1 1 2 3 5 8 13 24 .....
    */
    public static void fibonacciSeries() {
        Scanner console = new Scanner(System.in);

        int number;  // To hold number of terms
        int firstTerm = 0, secondTerm = 1, thirdTerm;

        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();

        System.out.print("fibonacci series: " + firstTerm + " " + secondTerm + " ");

        for (int i = 2; i < number; i++) {
            thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
            System.out.print(thirdTerm + " ");
        }
        System.out.println();
    }


    /* TODO: Question 14
        Write a program to calculate the sum of following series where n is input by user.
        1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
    */
    public static void sumOfSeries() {
        Scanner console = new Scanner(System.in);

        int number;  // To hold number of terms

        double sum = 0;

        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();

        for (int i = 1; i <= number; i++) {
            sum += 1.0 / i;
        }

        System.out.println("sum: " + sum);
    }


    /* TODO: Question 15
         Write a program that generates a random number and asks the user to guess what the number is.
         If the user's guess is higher than the random number, the program should display "Too high, try again."
         If the user's guess is lower than the random number, the program should display "Too low, try again."
         The program should use a loop that repeats until the user correctly guesses the random number.
    */
    public static void guessMyNumber() {
        Scanner console = new Scanner(System.in);

        int randomNumber, // To hold the random number
                guess,  // To hold the number guessed by user
                tries = 0; // To hold number of tries
        randomNumber = (int) (Math.random() * 100) + 1; // get random number between 1 and 100

        System.out.println("Guess My Number Game");

        while (true) {
            guess = console.nextInt();
            if (guess < randomNumber) {
                tries++;
                System.out.println("too low, try again.");
                System.out.println("tries: " + tries);
            } else if (guess > randomNumber) {
                tries++;
                System.out.println("too high, try again.");
                System.out.println("tries: " + tries);
            } else {
                tries++;
                System.out.println("that's right, you guess. the number is " + randomNumber);
                System.out.println("tries: " + tries);
                break;
            }
        }
        System.out.println();
    }
}

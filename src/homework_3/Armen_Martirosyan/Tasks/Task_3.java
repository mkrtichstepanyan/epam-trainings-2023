package homework_3.Armen_Martirosyan.Tasks;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
        FindHcf();                   // Question 8
        sumAgain();                  // Question 9
        countNumbers();              // Question 10
        findMaxMin();                // Question 11
        armstrongNumber();           // Question 12
        fibonacciSeries();           // Question 13
        sumOfSeries();               // Question 14
        guessMyNumber();             // Question 15
    }


    /* TODO: Question 8
        Write a program to calculate HCF of Two given number.
    */
    public static void FindHcf() {
        System.out.println("Question 8. \n-------------------------");
        Scanner console = new Scanner(System.in);

        int dividend, divisor;
        int remainder, hcf = 0;

        System.out.print("Enter the first number ");
        dividend = console.nextInt();

        System.out.print("Enter the second number ");
        divisor = console.nextInt();

        if (dividend == 0 || divisor == 0) {
            System.out.println("Divident or divisor must not be equals 0");
        } else {
            for (remainder = 1; remainder <= dividend || remainder <= divisor; remainder++) {
                if (dividend % remainder == 0 && divisor % remainder == 0) {
                    hcf = remainder;
                }
            }
            System.out.println("HCF: " + hcf);
        }
    }


    /* TODO: Question 9
        Write a do-while loop that asks the user to enter two numbers.
        The numbers should be added and the sum displayed.
        The loop should ask the user whether he or she wishes to perform the operation again.
        If so, the loop should repeat; otherwise it should terminate.
    */

    public static void sumAgain() {
        System.out.println("Question 9. \n-------------------------");
        Scanner console = new Scanner(System.in);

        int number;
        char choice;
        int sum = 0;

        do {
            System.out.println("Enter the number");
            number = console.nextInt();

            sum += number;

            System.out.println("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
        System.out.println("sum = " + sum);
    }

    /* TODO: Question 10
        Write a program to enter the numbers till the user wants and at the end it should display the count of positive,
        negative and zeros entered.
    */

    public static void countNumbers() {
        System.out.println("Question 10. \n-------------------------");
        Scanner console = new Scanner(System.in);

        int number, countPositive = 0, countNegative = 0, countZero = 0;

        char choice;

        do {
            System.out.print("Enter the number ");
            number = console.nextInt();

            if (number > 0) {
                countPositive += number;
            } else {
                countNegative += number;
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
        System.out.println("Question 11. \n-------------------------");
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
            } else
                min = number;

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
        System.out.println("Question 12. \n-------------------------");
        Scanner console = new Scanner(System.in);
        int number;

        System.out.print("Enter the number ");
        number = console.nextInt();

        int digit2 = number;
        int digit1;
        int sum = 0;

        while (number > 0) {
            digit1 = number % 10;
            number = number / 10;
            sum = sum + digit1 * digit1 * digit1;
        }
        if (digit2 == sum) {
            System.out.println("Its an amstrong number");
        } else {
            System.out.println("Its not an amstrong number");
        }
    }


    /* TODO: Question 13
        Write a program to print Fibonacci series of n terms where n is input by user :
        0 1 1 2 3 5 8 13 24 .....
    */
    public static void fibonacciSeries() {
        System.out.println("Question 13. \n-------------------------");
        Scanner console = new Scanner(System.in);

        int number;  // To hold number of terms

        int firstTerm = 0, secondTerm = 1, thirdTerm;

        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();

        for (int i = 2; i < number; i++) {
            thirdTerm = firstTerm + secondTerm;

            System.out.println(thirdTerm);
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
        System.out.print("First number is " + firstTerm + "\nSecond number is " + secondTerm);
    }


    /* TODO: Question 14
        Write a program to calculate the sum of following series where n is input by user.
        1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
    */
    public static void sumOfSeries() {
        System.out.println("Question 14. \n-------------------------");
        Scanner console = new Scanner(System.in);

        int number;  // To hold number of terms

        double sum = 0;

        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();

        for (int i = 1; i <= number; i++) {
            sum += (double) 1 / i;
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
        System.out.println("Question 15. \n-------------------------");
        Scanner console = new Scanner(System.in);

        int number, // To hold the random number
                guess,  // To hold the number guessed by user
                tries = 0; // To hold number of tries

        number = (int) (Math.random() * 100) + 1; // get random number between 1 and 100

        System.out.println("Guess My Number Game");
        System.out.println();

        while (true) {
            System.out.println("Random number is " + number);
            guess = console.nextInt();
            if (guess == number) {
                System.out.println("You find the guess number");
                break;
            } else if (number > guess) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Too low, try again");
            }
            tries++;
        }
        System.out.println("Tries count = " + tries);
    }
}


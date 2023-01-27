package homework_3.Zara_Avetyan.tasks;

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

    public static void FindHcf() {
        Scanner console = new Scanner(System.in);

        int dividend, divisor;
        int hcf = 0;
        System.out.print("Enter the first number ");
        dividend = console.nextInt();
        System.out.print("Enter the second number ");
        divisor = console.nextInt();
        for (int i = divisor; hcf == 0; i--) {
            if (dividend % i == 0 & divisor % i == 0) {
                hcf = i;
                break;
            }
        }
        System.out.println("HCF: " + hcf);
    }

    public static void sumAgain() {
        Scanner console = new Scanner(System.in);
        int number1, sum;
        char choice;
        do {
            System.out.print("Enter the first number: ");
            number1 = console.nextInt();
            System.out.print("Enter the second number: ");
            sum = console.nextInt() + number1;
            System.out.println("Sum = " + sum);
            System.out.println("Do you want to continue y/n? ");

            choice = console.next().charAt(0);
        } while (choice == 'y' | choice == 'Y');
    }

    public static void countNumbers() {
        Scanner console = new Scanner(System.in);

        int number, countPositive = 0, countNegative = 0, countZero = 0;

        char choice;

        do {
            System.out.print("Enter the number ");
            number = console.nextInt();
            if (number > 0) countPositive++;
            else if (number < 0) countNegative++;
            else countZero++;
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);
    }

    public static void findMaxMin() {
        Scanner console = new Scanner(System.in);

        int number;
        int max = Integer.MIN_VALUE;  // Intialize max with minimum value
        int min = Integer.MAX_VALUE;  // Intialize min with maximum value

        char choice;
        do {
            System.out.print("Enter the number ");
            number = console.nextInt();
            if (max < number) max = number;
            if (min > number) min = number;
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }

    public static void armstrongNumber() {
        int digit1, digit2, digit3;
        for (int i = 1; i <= 500; i++) {
            digit1 = i / 100;
            digit3 = i % 10;
            digit2 = (i - 100 * digit1) / 10;
            if ((digit3 * digit3 * digit3 + digit2 * digit2 * digit2 + digit1 * digit1 * digit1) == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void fibonacciSeries() {
        Scanner console = new Scanner(System.in);
        int number;  // To hold number of terms
        int firstTerm = 0, secondTerm = 1, thirdTerm;
        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();
        System.out.print(firstTerm + " " + secondTerm + " ");
        while ((firstTerm + secondTerm) < number) {
            thirdTerm = firstTerm + secondTerm;
            System.out.print(thirdTerm + " ");
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
        System.out.println();
    }

    public static void sumOfSeries() {
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

    public static void guessMyNumber() {
        Scanner console = new Scanner(System.in);

        int number, // To hold the random number
                guess,  // To hold the number guessed by user
                tries = 0; // To hold number of tries

        number = (int) (Math.random() * 100) + 1; // get random number between 1 and 100

        System.out.println("Guess My Number Game");
        System.out.println();
         do {
            guess = console.nextInt();
            tries++;
            if (guess > number) {
                System.out.println("Too high, try again.");
            } else if (guess < number) {
                System.out.println("Too low, try again.");
            } else System.out.println("You won on the " + tries + "th attempt.");
        }while (guess != number);
    }
}

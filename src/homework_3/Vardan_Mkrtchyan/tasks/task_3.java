package Vardan_Mkrtchyan.tasks;
import java.util.Scanner;
public class task_3 {
    public static void main(String[] args) {
        //FindHcf();
        //sumAgain();
        //countNumbers();
        //findMaxMin();
        armstrongNumber();
        fibonacciSeries();
        sumOfSeries();
        guessMyNumber();
    }
    public static void FindHcf() {
        Scanner console = new Scanner(System.in);

        int dividend, divisor;
        int remainder, hcf = 1;

        System.out.print("Enter the first number ");
        dividend = console.nextInt();

        System.out.print("Enter the second number ");
        divisor = console.nextInt();
        if(dividend < divisor){
            remainder = dividend;
            dividend = divisor;
            divisor = remainder;
        }
        for(int i = 1; i <= divisor; i++){
            if(dividend % i == 0 && divisor % i == 0){
                hcf = i;
            }
        }
        System.out.println("hcf: " + hcf);

    }
    public static void sumAgain() {
        Scanner console = new Scanner(System.in);

        int number1, number2;
        char choice;

        do{
            System.out.printf("number 1: ");
            number1 = console.nextInt();
            System.out.printf("number 2: ");
            number2 = console.nextInt();
            System.out.printf("Sum: " + (number1 + number2));
            System.out.printf(" continue? (y/n): ");
            choice = console.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
    }
    public static void countNumbers() {
        Scanner console = new Scanner(System.in);

        int number, countPositive = 0, countNegative = 0, countZero = 0;

        char choice;

        do {
            System.out.printf("Enter the number: ");
            number = console.nextInt();

            if(number > 0) countPositive++;
            else if (number < 0) countNegative++;
            else countZero++;

            System.out.printf("Do you want to continue? (y/n): ");
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

        do{
            System.out.printf("number: ");
            number = console.nextInt();

            if(max < number) max = number;
            if(min > number) min = number;

            System.out.printf("continue? (y/n): ");
            choice = console.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }

    public static void armstrongNumber() {
        System.out.println("Armstrong numbers: ");
        for (int i = 100; i <= 500; i++) {
            if (i == aa(i % 10, (i / 10) % 10, (i / 100) % 10)){
                System.out.print(i + " ");

            }
        }
        System.out.println();

    }
    public static int aa(int x, int y, int z){
        int a = x, b = y, c = z;
        for(int i = 1; i < 3; i++){
            x = x * a;
            y = y * b;
            z = z * c;
        }
        return x + y + z;
    }
    public static void fibonacciSeries() {
        Scanner console = new Scanner(System.in);

        int number, a = 0, b = 1, c;
        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();

        for(int i = 2; i <= number; i++)
        {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }

    }
    public static void sumOfSeries() {
        Scanner console = new Scanner(System.in);

        int number;
        double sum = 0;

        System.out.println();
        System.out.print("Enter number of terms of series: ");
        number = console.nextInt();
        for(double i = 1; i <= number; i++){
            sum = 1 / i + sum;
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

        do{
            tries++;
            guess = console.nextInt();
            if(guess > number){
                System.out.println("Too high, try again.");
            }
            else{
                System.out.println("Too low, try again.");
            }
        } while(guess != number);
        System.out.println("Congrats, you guessed the number in "+ tries + " tries!!!");
    }

}

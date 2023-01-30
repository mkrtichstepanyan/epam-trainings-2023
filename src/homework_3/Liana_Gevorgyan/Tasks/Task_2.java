package homework_3.Liana_Gevorgyan.Tasks;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
     //printNumbers(1);            // Question 1 -> try with different integer values instead of 10 only
 // sumNumbers();                // Question 2
     //factorialDemo1();            // Question 3
     //  powerDemo();                 // Question 4
    // reverseNumber();             // Question 5
     //  readSetIntegers();           // Question 6
      // testPrime();                 // Question 7
   //     table();
    }


    /*  Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {

        for (int i = 1; i<=count ; i++) {
            System.out.println(i);

        }

    }

    /* Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static void sumNumbers() {
        int sum = 0;
        // Todo write your code here ...
        for (int i = 1; i <=10 ; i++) {
                sum= sum+i;

        }
        System.out.println("Sum: " + sum);
    }


    /*
        Write a program that prompts the user to input a positive integer.
        It should then print the multiplication table of that number.
    */
    public static void table() {
        Scanner console = new Scanner(System.in);
        int num;

        System.out.print("Enter any positive integer: ");
        num = console.nextInt();

        System.out.println("Multiplication Table of " + num);
        if(num>0){
            for (int i = 1; i <=9; i++) {
                System.out.println(i + " * " + num+ " = "  + num*i);

            }

        } else {
            System.out.println( num  + " is not positive");
        }

    }


    /*
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static void factorialDemo1() {
        Scanner console = new Scanner(System.in);
        int num; // To hold number
        int fact = 1; // To hold factorial

        System.out.print("Enter any positive integer: ");
        num = console.nextInt();

       if (num>0){
           for (int i=1; i<=num; i++){
               fact=fact*i;

           }

       }else{
//           for (int i =-1; i >= num; i--) {
//              fact=fact*i;
//
//           }
           System.out.println(num + " is not positive ");
       }

        System.out.println("Factorial: " + fact);
    }

     /* TODO: Question 4
         Two numbers are entered through the keyboard.
         Write a program to find the value of one number raised to the power of another.
         (Do not use Java built-in method)
     */

    public static void powerDemo() {
        Scanner console = new Scanner(System.in);

        int base;
        int power;
        int result = 1;

        System.out.print("Enter the base number ");
        base = console.nextInt();

        System.out.print("Enter the power ");
        power = console.nextInt();

        for (int i = 0; i < power; i++) {
            result=result*base;

        }

        System.out.println("Result: " + result);
    }

     /*
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static void reverseNumber() {
        Scanner console = new Scanner(System.in);

        int number;
        int reverse = 0;

        System.out.print("Enter the number ");
        number = console.nextInt();

        int temp = number;
        int remainder = 0;
    //by dividing  to 10 we will get reminding value
        while (temp!=0)
        {
            //System.out.println(temp);
           remainder=temp%10;
           temp=temp/10;
           //to concatenate full number by digits we should multiply initial number to 10 and add current digit
           reverse=reverse*10+remainder;
           // System.out.println(reverse);

       }
        System.out.println("Reverse of " + number + " is " + reverse);
    }

    /* TODO: Question 6
         Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
    */

    public static void readSetIntegers() {
        Scanner console = new Scanner(System.in);

        int number;
        char choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.print("Enter the number ");
            number = console.nextInt();

            if(number %2 ==0){
                evenSum=evenSum+number;

            }else oddSum=oddSum+number;

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }

    /* TODO: Question 7
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */
    public static void testPrime() {
        Scanner console = new Scanner(System.in);

        int number;

        System.out.print("Enter the positive integer ");
        number = console.nextInt();

        boolean flag = true;
//should check if provided number divides to at least  one  number from 2 to half of provided number
        //should use loop for iterating each  check number one by one
        for (int i = 2; i < number/2; i++) {
            //check if number divides to current checking number i
            if(number%i==0){
                //number divided without reminder, so it is not prime,
                //should break the loop since there is no need to check other numbers
                flag= false;
                break;
            }
        }
        //in case of prime flag will remain true, otherwise it will set false
        if(flag==true){
            System.out.println("provided number is prime ");
        }else {
            System.out.println("provided number is not prime ");
        }

    }
}



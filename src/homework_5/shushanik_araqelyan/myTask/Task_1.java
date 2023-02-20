package homework_5.shushanik_araqelyan.myTask;

public class Task_1 {

    public static void main(String[] args) {
//        printNumbers(10);            // Question 1 -> try with different integer values instead of 10 only
        //     System.out.println(sumNumbers(4));// Question 2
        // System.out.println(factorialDemo1(6));            // Question 3

        //     System.out.println(powerDemo(2, 3));                // Question 4
        reverseNumber(5647);             // Question 5
//        readSetIntegers();           // Question 6

  //      System.out.println(testPrime(21));                 // Question 7
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        //      Todo write your code here ...

        if (count > 0) {
            printNumbers(count - 1);

            System.out.println(count);

        }


    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    static int sum = 0;

    public static int sumNumbers(int number) {
        // Todo write your code here ...
        if (number > 0) {
            sumNumbers(number - 1);
            sum = number + sum;
            return sum;
        }
        return 0;
    }


    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static int factorialDemo1(int num) {
        // Todo write your code here ...
        if (num == 1) {
            return num;
        }
        return num * factorialDemo1(num - 1);
    }








     /* TODO: Question 4
         Two numbers are entered through the keyboard.
         Write a program to find the value of one number raised to the power of another.
         (Do not use Java built-in method)
     */

    public static int powerDemo(int base, int power) {
        int result = 1;
        // Todo write your code here ...
        if (power != 0) {
            return (base * powerDemo(base, power - 1));
        }
        return 1;

    }




     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */
     static  int  reverse = 0;
    public static void reverseNumber(int number) {

        int temp = number;
        int remainder = 0;

            if(number!= 0){
                if(reverse==0){
                    reverse =number%10;
                    reverseNumber(number/10);
                    return;
                }
                temp = number % 10;
                reverse = reverse * 10 + temp;
                reverseNumber(number/10);
return;

            }
        System.out.println(reverse);





        // Todo write your code here ...



    }


    // TODO: Question 6
    //   Write a program that prompts the user to input a positive integer.
    //  It should then output a message indicating whether the number is a prime number.

    public static boolean testPrime(int number) {

        // Todo write your code here ...
      if(number % 2==0) {
          return false;
      }
        testPrime(number-1);
            return true;
        }
    }









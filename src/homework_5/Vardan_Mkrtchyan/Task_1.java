package homework_5.Vardan_Mkrtchyan;

public class Task_1 {
    public static void main(String[] args) {
        printNumbers(15);            // Question 1 -> try with different integer values instead of 10 only
        sumNumbers(6,true);
        System.out.println("Factorial: ");// Question 2
        factorialDemo1(6, true);
        System.out.println("PowerDemo: ");// Question 3
        powerDemo(6, 3, true);
        System.out.println("Reverse: ");// Question 4
        reverseNumber(856, true);// Question 5
        testPrime(257, 7);                 // Question 7
    }

    public static int temp;
    public static void printNumbers(int count) {
        if (count <= 0) {
            System.out.println();
            return;
        } else {
            System.out.print(count + "  ");
            printNumbers(count - 1);

        }
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static void sumNumbers(int number, boolean tr) {
        if(tr){
            temp = 0;
        }
        if(number <= 0){
            System.out.println("Sum: "+  + temp);
            return;
        }
        else{
            temp = temp + number;
            sumNumbers(number - 1, false);
        }

    }


    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */

    public static void factorialDemo1(int number, boolean tr) {

        if(tr){
            temp = 1;
        }
        if(number <= 1){
            System.out.println(temp);
            return;
        }
        else{
            temp = temp * number;
            factorialDemo1(number - 1, false);
        }

    }

     /* TODO: Question 4
         Two numbers are entered through the keyboard.
         Write a program to find the value of one number raised to the power of another.
         (Do not use Java built-in method)
     */

    public static void powerDemo(int base, int power, boolean tr) {
        if(tr){
            temp = 1;
        }
        if(power <= 0){
            System.out.println(temp);
            return;
        }
        else {
            temp = temp * base;
            powerDemo(base,power - 1, false);
        }

    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static void reverseNumber(int number, boolean tr) {
        if(tr){
            temp = 0;
        }
        if(number == 0){
            System.out.println(temp);
            return;
        }
        else {
            temp = temp * 10 + number % 10;
            reverseNumber(number / 10, false);
        }
    }


    /* TODO: Question 6
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */
    public static void testPrime(int number, int i) {
        if(i >= 2){
            if(number % i == 0){
                System.out.println("number " + number + " is not prime");
                return;
            }
            else{
                testPrime(number, i - 1);
            }
        } else {
            System.out.println("number " + number + " is prime");
            return;
        }

    }

}

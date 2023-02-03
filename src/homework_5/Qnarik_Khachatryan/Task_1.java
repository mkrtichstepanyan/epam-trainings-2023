package homework_5.Qnarik_Khachatryan;

public class Task_1 {

    public static void main(String[] args) {
//        System.out.println(printNumbers(10,1));            // Question 1 -> try with different integer values instead of 10 only
//        System.out.println(sumNumbers(4));                // Question 2
//        System.out.println(factorialDemo1(9));            // Question 3
//        System.out.println(powerDemo(2, 3));                 // Question 4
//        System.out.println(reverseNumber(987654321));             // Question 5
        testPrime(8);                 // Question 6
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */

    public static int printNumbers(int count, int start) {
        if (start == count) {
            return count;
        } else if (start < count) {
            System.out.print(start + " ");
            start += 1;
        }
        return printNumbers(start, count);
    }


    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static int sumNumbers(int finish) {
        int sum;
        if (finish == 1) {
            return 1;
        }
        sum = sumNumbers(finish - 1) + finish;
        return sum;
    }


    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static int factorialDemo1(int num) {
        int result;
        if (num == 1) {
            return 1;
        }
        result = factorialDemo1(num - 1) * num;
        return result;
    }

     /* TODO: Question 4
         Two numbers are entered through the keyboard.
         Write a program to find the value of one number raised to the power of another.
         (Do not use Java built-in method)
     */

    public static int powerDemo(int base, int power) {
        int result;
        if (power == 1 || base == 1) {
            return base;
        } else {
            result = powerDemo(base, power - 1) * base;
        }
        return result;
    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static int reverseNumber(int number) {
        int reminder;
        int temp;
        reminder = number % 10;
        temp = number / 10;
        if (temp == 0) {
            return reminder;
        } else {
            System.out.print(reminder);
            reminder = reverseNumber(temp);
            return reminder;
        }
    }


    /* TODO: Question 6
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */

    static int start = 2;

    public static boolean isPrime(int number) {
        boolean flag = true;
        if (number == 1) {
            flag = false;
        }
        if (number > 2) {
            if (number % start == 0) {
                flag = false; //not prime
            } else {
                start++;
                isPrime(number);
            }
        }
        return flag;
    }

    public static void testPrime(int number) {
        if (isPrime(number)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}

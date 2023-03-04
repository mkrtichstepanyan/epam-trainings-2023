//package homework_3.Hayk_Davtyan.Tasks;
//
//import java.util.Scanner;
//
//public class Task2 {
//    public static void main(String[] args){
////        printNumbers(10);
////        sumNumbers(10);
////        factorialDemo1();
////        powerDemo();
//        reverseNumber();
////        readSetInteger();
////        testPrime();
////        table();
//
//    }
//
//    public static void printNumbers(int count) {
//        for (int i = 1; i <= count; i++) {
//            System.out.print(i + " ");
//        }
//    }
//
//    public static void sumNumbers(int count) {
//        int sum = 0;
//        for (int i = 0; i <= count; i++) {
//            sum = sum + i;
//        }
//        System.out.println("Sum: " + sum);
//    }
//
//    public static void table() {
//        Scanner console = new Scanner(System.in);
//        int num;
//        System.out.print("Enter any positive integer: ");
//        num = console.nextInt();
//
//        System.out.println("Multiplication Table of " + num);
//        if (num > 0) {
//            for (int i = 0; i <= 10; i++) {
//                System.out.println(num + "*" + i + "= " + num * i);
//            }
//        } else {
//            System.out.println("this number is negativ");
//        }
//    }
//
//    public static void factorialDemo1() {
//        Scanner console = new Scanner(System.in);
//        int num;
//        int fact = 1;
//
//        System.out.println("Enter any positive integer: ");
//        num = console.nextInt();
//        if (num > 0) {
//            for (int i = 1; i <= num; i++) {
//                fact = fact * i;
//            }
//            System.out.println("Factorial: " + fact);
//        } else if (num < 0) {
//            System.out.println("Please write positiv number");
//
//        } else {
//            System.out.println("Factorial: " + fact);
//        }
//    }
//
//    public static void powerDemo() {
//        Scanner console = new Scanner(System.in);
//        int base;
//        int power;
//        int result = 1;
//        System.out.println("Enter the base number ");
//        base = console.nextInt();
//        System.out.println("Enter the power number ");
//        power = console.nextInt();
//        if (power == 0) {
//            System.out.println("Result: " + result);
//        } else {
//            for (int i = 1; i <= power; i++) {
//                result = result * base;
//            }
//        }
//
//        System.out.println("Result: " + result);
//
//
//    }
//
//    public static void reverseNumber(int i) {
//        Scanner console = new Scanner(System.in);
//        int number;
//        int reverse = 0;
//        int remainder = 0;
//        System.out.println("Enter the number ");
//        number = console.nextInt();
//        int temp = number;
//        while (temp != 0) {
//            remainder = temp % 10;
//            reverse = reverse * 10 + remainder;
//            temp /=  10;
//        }
//        System.out.println("Reverse of " + number + " is " + reverse);
//    }
//
//    public static void readSetInteger() {
//        Scanner console = new Scanner(System.in);
//        int number;
//        char choice;
//        int evenSum = 0;
//        int oddSum = 0;
//        do {
//            System.out.println("Enter the number ");
//            number = console.nextInt();
//            if (number % 2 == 0) {
//                evenSum = evenSum + number;
//            } else {
//                oddSum = oddSum + number;
//            }
//            System.out.print("Do you want to continue y/n? ");
//            choice = console.next().charAt(0);
//        } while (choice == 'Y' || choice == 'y');
//
//        System.out.println("Sum of even numbers: " + evenSum);
//        System.out.println("Sum of odd numbers: " + oddSum);
//    }
//
//    public static void testPrime() {
//        Scanner console = new Scanner(System.in);
//        int number;
//        System.out.println("Enter the positive integer ");
//        number = console.nextInt();
//        boolean flag = true;
//
//        if (((number % 2 != 0) && (number % 3 != 0)) && ((number % 5 != 0) && (number % 7 != 0))) {
//            System.out.println("The " + number + " is a prime number");
//        } else if (number == 1 || number == 2 || number == 3 || number == 5 || number == 7) {
//            System.out.println("The " + number + " is a prime number");
//        } else {
//            System.out.println("The number is not a prime");
//        }
//    }
//}

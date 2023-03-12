package homework_6.Hayk_Davtyan.Task;

public class Task {
    public static void main(String[] args) {
//        printNumbers(5);
//        sumNumbers(5);
//        factorialDemo1(4);
//        powerDemo(5, 2);
//        testPrime(16);
    }

    public static void printNumbers(int num) {
        if (num <= 0) {
            return;
        }
        printNumbers(num - 1);
        System.out.println(num + " ");
    }

    public static int sumNumbers(int num) {
        int a;
        if (num <= 0) {
            return num;
        }
        return (num + sumNumbers(num - 1));
    }

    public static int factorialDemo1(int num) {
        int factorial = 1;
        if (num == 0 || num == 1) {
            return factorial;
        }
        return num * factorialDemo1(num - 1);
    }

    public static int powerDemo(int base, int power) {
        int result = 1;
        if (power == 0) {
            return result;
        }
        return  base * powerDemo(base, power - 1);
    }

    public static int testPrime(int number){
        if (number == 1 || number == 2 || number == 3 || number == 5 || number == 7){
            return number;
        }
        for (int i = 2; i < 10 ; i++) {
            if (number % i == 0){
                return number;
            }
        }
        return testPrime(number);
    }
}


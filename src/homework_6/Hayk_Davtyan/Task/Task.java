package homework_6.Hayk_Davtyan.Task;

public class Task {
    public static void main(String[] args) {
//         printNumbers(5);
//         System.out.println(sumNumbers(10));
//        System.out.println(factorialDemo1(6));;
//         System.out.println(powerDemo(5, 3));
//        if (testPrime(1254,2))
//            System.out.println("the number is Prime");
//         else
//            System.out.println("the number is not Prime");
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
        return base * powerDemo(base, power - 1);
    }

//    public static void testPrime(int number) {
//        boolean b = true;
//        for (int i = 2; i < number/2 ; i++) {
//            if (number % i == 0){
//                b = false;
//                break;
//            }
//        }
//        if(b == true){
//            System.out.println("the number " + number + " is Prime");
//        }else{
//            System.out.println("the number " + number + " is  not Prime");
//        }
//    }
    public static boolean testPrime(int number, int i){
        if(number == 2)
            return true;
        if(number % i == 0)
            return false;
        if(i * i > number)
            return true;
        return testPrime(number, i + 1);
    }

}


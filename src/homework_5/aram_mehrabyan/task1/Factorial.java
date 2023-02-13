package homework_5.aram_mehrabyan.task1;


public class Factorial {

    public static int factorialDemo1(int n) {
        int fact;
        if(n==0)
            return  1;
        fact=n*factorialDemo1(n-1);
        return fact;
    }
}
class TestFactorial{
    public static void main(String[] args) {

        System.out.println("Factorial: " + Factorial.factorialDemo1(5));
    }
}

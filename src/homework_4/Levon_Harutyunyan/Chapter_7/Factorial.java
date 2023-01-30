package homework_4.Levon_Harutyunyan.Chapter_7;

public class Factorial {
    int fact(int n) {
        int result;
        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}

class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("Factorial 3 is equal " + f.fact(3));
        System.out.println("Factorial 4 is equal " + f.fact(4));
        System.out.println("Factorial 5 is equal " + f.fact(5));

    }
}


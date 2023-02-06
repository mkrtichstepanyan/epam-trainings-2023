package homework_4.Liana_gevorgyan.Chapter_7;
//A sample example of recursion
class Factorial {
    //this is a recursive method
    int fact(int n)
    {int result;
        if (n == 1) return 1;
        result =  fact(n-1)*n;
        return result;

    }
}
 class Recursion {
     public static void main(String[] args) {
         Factorial f = new Factorial();
         System.out.println("factorial of 3 is " + f.fact(3));
         System.out.println("factorial of 4 is " + f.fact(4));
         System.out.println("factorial of 5 is " + f.fact(5));
     }
}

package homework_5.aram_mehrabyan.task1;

public class PrimeNumber {
    static int i=2;
    public static void main(String[] args) {
  if(isPrime(21))
      System.out.println("The number is prime");
  else
      System.out.println("The number is not prime");
    }
    public static boolean isPrime(int n){
        if(i==n/2+1)
            return true;
        if(n%i==0)
            return false;
        i++;
        return isPrime(n);
    }
}

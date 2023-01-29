package homework_3.Arsen_Kazaryan.chapter_5;

public class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;
        num = 14;
        if(num < 2) isPrime = false;
        else isPrime = true;
        for (int i =2; i <= num/i; i++){
            if ((num % i) ==0){
    isPrime = false;
    break;
            }
        }
        if (isPrime) System.out.println("является простым");
        else System.out.println("не является простым");
    }
}

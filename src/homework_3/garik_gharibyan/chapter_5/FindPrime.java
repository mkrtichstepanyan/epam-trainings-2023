package homework_3.garik_gharibyan.chapter_5;

import java.util.Scanner;

public class FindPrime {
    public static void main(String[] args) {

        int num;
        boolean isPrime;

        num = 14;

        if (num < 2){
            isPrime = false;
        }else {
            isPrime = true;
        }

        for (int i = 2; i < num/i; i++) {
            if (num % i == 0){
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            System.out.println("Prime");
        }else {
            System.out.println("not Prime");
        }
    }
}

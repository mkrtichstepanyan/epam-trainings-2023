package homework_5.aram_mehrabyan.task1;

import java.util.Scanner;

public class Power {
    public  int powerDemo(int base,int power) {

        if(power==0)
            return 1;

        return base*powerDemo(base,power-1);


    }
}
class PowerDemo{
    public static void main(String[] args) {
        Power pwr=new Power();
        System.out.println("Result: " + pwr.powerDemo(2,4));
    }
}

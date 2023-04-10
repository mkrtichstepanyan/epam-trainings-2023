package homework_9.Yeghia_Ansuryan.Chapter_12.EnumDemo;

import static homework_9.Yeghia_Ansuryan.Chapter_12.EnumDemo.Apple.*;

public class EnumDemo  {
    public static void main(String[] args)
    {
        Apple ap;
        ap = RedDel;
        System.out.println("Value of ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;
        if(ap == Apple.GoldenDel)
            System.out.println("ap contains GoldenDel.\n");

        switch (ap) {
            case Jonathan:
                System.out.println("Jonathan is red.");
                break;
            case GoldenDel:
                System.out.println("GoldenDel is yellow.");
                break;
            case RedDel:
                System.out.println("Red Delicious is red.");
                break;
            case Winesap:
                System.out.println("Winesap is red.");
                break;
            case Cortland:
                System.out.println("Cortland is red.");
                break;
        }
    }
}

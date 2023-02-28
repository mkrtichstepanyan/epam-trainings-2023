package homework_9.araksya.ghazaryan.chapter_12;

import homework_9.araksya.ghazaryan.chapter_12.Apple;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        System.out.println("Valu of ap: " + ap);
        System.out.println();

        ap = Apple.Cortland;
        if (ap == Apple.GoldenDel) {
            System.out.println("ap conteins GoldeDel: " + ap);
            System.out.println();
        }

        switch (ap) {
            case Jonathan:
                System.out.println("Jonathan is red");
                break;
            case GoldenDel:
                System.out.println("Golden Delicos is yellow.");
                break;
            case RedDel:
                System.out.println("RedDel is red.");
                break;
            case Winesap:
                System.out.println(" Winesap is red.");
                break;
            case Cortland:
                System.out.println(" Cortland is red.");
                break;
        }
    }
}
package homework_9.Vladimir_Vanyan.chapter_12;

public class EnumDemo {

    public static void main(String[] args) {
        Apple ap;
        //output  an enum value
        ap = Apple.RedDel;
        System.out.println("Value of ар: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        //compare two enum values
        if (ap == Apple.GoldenDel) {
            System.out.println("ap contains GoldenDel.\n");
        }

        //use an enum to control a switch statement
        switch (ap) {
            case Jonathan:
                System.out.println("Jonathan is red");
                break;
            case GoldenDel:
                System.out.println("Golden delicious is yellow");
                break;
            case RedDel:
                System.out.println("Red Delicious is red");
                break;
            case Winesap:
                System.out.println("Winesap is red");
                break;
            case Cortland:
                System.out.println("Cortland is re");
                break;
        }
    }
}
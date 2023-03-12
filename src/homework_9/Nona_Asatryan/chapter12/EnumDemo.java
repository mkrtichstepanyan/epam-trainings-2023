package homework_9.Nona_Asatryan.chapter12;

public class EnumDemo {

    public static void main(String[] args) {
        Apple ap;
        ap = Apple.REDDEL;

        System.out.println("Value of ap: " + ap);
        System.out.println();

        ap = Apple.GOLDENDEL;

        if (ap == Apple.GOLDENDEL) {
            System.out.println("ap contains GoldenDel.");
        }

        switch (ap) {
            case JONATHAN:
                System.out.println("Jonathan is red.");
                break;
            case GOLDENDEL:
                System.out.println("Golden delicious is yellow.");
                break;
            case REDDEL:
                System.out.println("Red delicious is red.");
                break;
            case WINESAP:
                System.out.println("Winesap is red.");
                break;
            case CORTLAND:
                System.out.println("Cortland is red.");
                break;
        }
    }
}

package homework_9.Ofelya_Khachatryan.chapter_12;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;

        ap = Apple.RED_DEL;

        System.out.println("Value of ap: " + ap);
        System.out.println();

        ap = Apple.GOLDEN_DEL;

        if (ap == Apple.GOLDEN_DEL) {
            System.out.println("ap contains GOLDEN_DEL.\n");
        }

        switch (ap) {
            case JONATHAN:
                System.out.println("Jonathan is red.");
                break;
            case GOLDEN_DEL:
                System.out.println("Golden Delicious is yellow.");
                break;
            case RED_DEL:
                System.out.println("Red Delicious is red.");
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

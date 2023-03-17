package homework_9.TatevKocharyan.chapter12;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.GoldenDel;
        System.out.println("Value of ap:" + ap);
        System.out.println();
        ap = Apple.Cortland;
        if (ap == Apple.Cortland)
            System.out.println("ap contains GoldenDel.");
        switch (ap) {
            case RedDel:
                System.out.println("Red");
                break;
            case Cortland:
                System.out.println("Red");
                break;
            case GoldenDel:
                System.out.println("Yellow");
                break;
        }
    }
}

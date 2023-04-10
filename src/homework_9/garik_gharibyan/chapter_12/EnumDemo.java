package homework_9.garik_gharibyan.chapter_12;
enum Apple{
    JonaThen, GoldenDel, RedDEl, Winesap, CordLand;

}
public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;

        ap = Apple.RedDEl;
        System.out.println("Value of ap: " + ap);

        System.out.println();

        ap = Apple.GoldenDel;
        if (ap == Apple.CordLand){
            System.out.println("Ap contains GoldenDel.\n");
        }

        switch (ap){
            case JonaThen:
                System.out.println("JonaThen is red.");
                break;
            case GoldenDel:
                System.out.println("GoldenDel is yellow");
                break;
            case RedDEl:
                System.out.println("Red Delicious is red.");
                break;
            case CordLand:
                System.out.println("CordLand is red.");
                break;
        }
    }
}

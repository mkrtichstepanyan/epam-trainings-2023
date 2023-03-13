package homework_9.Yeghia_Ansuryan.Chapter_12.EnumDemo;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Here are all Apple constants:");
        Apple[] allapples = Apple.values();
        for (Apple a : allapples)
            System.out.println(a);

        System.out.println();

        ap = Apple.valueOf("Winesap");
        System.out.println("ap contains " + ap);

    }
}

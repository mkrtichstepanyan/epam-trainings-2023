package homework_9.Roza_Petrosyan.chapter_12.Enum2;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;

        System.out.println("Winesap costs " + Apple.Winesap.getPrice() + " cents.\n");

        System.out.println("All apple prices");

        for (Apple a : Apple.values()) {
            System.out.println(a + "costs " + a.getPrice() + " cents.");
        }
    }
}

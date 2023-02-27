package homework_9.araksya.ghazaryan.chapter_12;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple3 ap;
        System.out.println("Winesap costs " + Apple3.Winesap.getPrice() +  " cents.");
        System.out.println("All apple prices: ");
        for (Apple3 a : Apple3.values()) {
            System.out.println(a + "cents " + a.getPrice() + " cents ");
        }
    }
}
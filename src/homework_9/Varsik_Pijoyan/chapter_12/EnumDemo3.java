package homework_9.Varsik_Pijoyan.chapter_12;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple2 ap2;

        System.out.println("Winesap costs: " +
                Apple2.Winesap.getPrice() +
                "cents. \n");
        System.out.println("All apple prices:");
        for (Apple2 a : Apple2.values()) {
            System.out.println(a + " costs " + a.getPrice() + " cents.");
        }
    }
}

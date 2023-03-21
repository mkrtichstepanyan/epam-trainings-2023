package homework_9.Eduard_Eghiazaryan.chaper_12.enums;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple apple;

        System.out.println("Winesap costs " + Apple.Winesap.getPrice() + " cents.\n");
        System.out.println("All apple prices:");
        for (Apple app : Apple.values()) {
            System.out.println(app + " costs " + app.getPrice() + " cents.");
        }
    }
}

package homework_14.Roza_Petrosyan.chapter_14.generic_hierarchy;

public class HireDmo3 {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        Gen2<Integer> iOb2 = new Gen2<>(99);
        Gen2<String> strOb2 = new Gen2<>("Generic Test");

        if (iOb2 instanceof Gen2<?>) {
            System.out.println("IOb2 is instance of Gen2");
        }
        if (iOb2 instanceof Gen<?>) {
            System.out.println("IOb2 is instance of Gen");
        }
        System.out.println();

        if (strOb2 instanceof Gen2<?>) {
            System.out.println("strOb2 is instance of Gen2");
        }

        if (strOb2 instanceof Gen<?>) {
            System.out.println("strOb2 is instance of Gen");
        }
        System.out.println();

        if (iOb instanceof Gen2<?>) {
            System.out.println("iOb is instance of Gen2");
        }

        if (iOb instanceof Gen<?>) {
            System.out.println("iOb is instance of Gen");
        }
    }
}

package homework_14.Radik_Manasyan.chapter14;

public class HierDemo3 {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        Gen2<Integer> iOb2 = new Gen2<>(99);
        Gen2<String> strOb2 = new Gen2<>("Generics test");

        if (iOb2 instanceof Gen2<?>) {
            System.out.println("Объект iOb2 является экземпляром класса Gen2");
        }

        if (iOb2 instanceof Gen<?>) {
            System.out.println("Объект iOb2 является экземпляром класса Gen");
        }
        System.out.println();

        if (strOb2 instanceof Gen2<?>) {
            System.out.println("Объект strOb2 является экземпляром класса Gen2");
        }

        if (strOb2 instanceof Gen<?>) {
            System.out.println("Объект strOb2 является экземпляром класса Gen");
        }
        System.out.println();

        if (iOb instanceof Gen2<?>) {
            System.out.println("Объект iOb является экземпляром класса Gen2");
        }

        if (iOb instanceof Gen<?>) {
            System.out.println("Объект iOb является экземпляром класса Gen");
        }
    }
}

package homework_14.Ani_Kovalenko.chapter_14.example_13;

public class HierDemo3 {
    public static void main(String[] args) {

        Gen<Integer> iOb = new Gen<>(88);
        Gen2<Integer> iOb2 = new Gen2<>(99);
        Gen2<String> strOb2 = new Gen2<>("Generic Test");

        if (iOb instanceof Gen2<?>) {
            System.out.println("iOb is instance of Gen2");
        } else if (iOb2 instanceof Gen<?>) {
            System.out.println("iOb is instance of Gen");
        }

        System.out.println();

        if (strOb2 instanceof Gen2) {
            System.out.println("strOb is instance of Gen2");
        } else if (strOb2 instanceof Gen) {
            System.out.println("strOb is instance of Gen");
        }
    }
}

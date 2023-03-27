package homework_14.rafik_pahlevanyan.chapter_14;

public class HierDemo3 {
    public static void main(String[] args) {

        Gen<Integer> iob = new Gen<>(88);
        Gen3<Integer> iob2 = new Gen3<>(99);

        Gen3<String> strob2 = new Gen3<>("Generics Test");

        if (iob2 instanceof Gen3<?>) {
            System.out.println("iob2 is instance of Gen3");
        }

        if (iob2 instanceof Gen<?>) {
            System.out.println("iob2 is instance of Gen");
        }
        if (strob2 instanceof Gen3<?>) {
            System.out.println("strob2 is instance of Gen3");
        }
        if (strob2 instanceof Gen<?>) {
            System.out.println("strob2 is instance of Gen");
        }

        System.out.println();

        if (iob instanceof Gen3<?>) {
            System.out.println("iob is instance of Gen3");
        }
        if (iob instanceof Gen<?>) {
            System.out.println("iob is instance of Gen");
        }
    }
}

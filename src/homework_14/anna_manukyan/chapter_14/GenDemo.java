package homework_14.anna_manukyan.chapter_14;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iob;
        iob = new Gen<>(88);

        iob.showType();

        int v = iob.getOb();
        System.out.println("Value: " + v);
        System.out.println();

        Gen<String> strob = new Gen<>("Generics test");

        strob.showType();

        String str = strob.getOb();
        System.out.println("value: " + str);

    }
}

package homework_14.rafik_pahlevanyan.chapter_14;

public class OverrideDemo {
    public static void main(String[] args) {

        Gen<Integer> iob = new Gen<>(88);
        Gen3<Integer> iob3 = new Gen3<>(99);

        Gen3<String> strob3 = new Gen3<>("Generics Test");

        System.out.println(iob.getOb());
        System.out.println(iob3.getOb());
        System.out.println(strob3.getOb());
    }
}

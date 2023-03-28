package homework_14.garik_gharibyan.chapter_14;

public class OverrideDemo {
    public static void main(String[] args) {
        Gen6<Integer> iOb1 = new Gen6<>(88);
        Gen7<Integer> iOb2 = new Gen7<>(99);
        Gen6<String> strOb2 = new Gen7<>("hello");

        System.out.println(iOb1.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(strOb2.getOb());
    }
}

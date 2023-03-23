package homework_14.rafik_pahlevanyan.chapter_14;

public class HierDemo {
    public static void main(String[] args) {
        Gen2<String, Integer> x = new Gen2<String, Integer>("Value is: ", 99);

        System.out.print(x.getOb());
        System.out.println(x.getOb2());
    }
}

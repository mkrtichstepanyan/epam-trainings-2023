package homework_14.rafik_pahlevanyan.chapter_14;

public class HierDemo1 {
    public static void main(String[] args) {

        Gen1<String> w = new Gen1<>("Hello", 47);

        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());
    }
}

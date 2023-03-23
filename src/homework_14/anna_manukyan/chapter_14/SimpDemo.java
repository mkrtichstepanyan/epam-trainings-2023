package homework_14.anna_manukyan.chapter_14;

public class SimpDemo {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgobj = new TwoGen<>(88, "Generics");
        tgobj.showType();

        int v = tgobj.getOb1();
        System.out.println("Value: " + v);
        System.out.println();

        String str = tgobj.getOb2();
        System.out.println("value: " + str);

    }
}

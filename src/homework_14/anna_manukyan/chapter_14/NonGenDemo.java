package homework_14.anna_manukyan.chapter_14;

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iob;
        iob = new NonGen(88);

        iob.showType();

        int v = (Integer) iob.getOb();
        System.out.println("Value: " + v);
        System.out.println();

        NonGen strob = new NonGen("Non Generics test");

        strob.showType();

        String str = (String) strob.getOb();
        System.out.println("value: " + str);

    }
}

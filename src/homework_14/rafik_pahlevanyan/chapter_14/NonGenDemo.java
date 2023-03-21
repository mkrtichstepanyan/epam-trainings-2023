package homework_14.rafik_pahlevanyan.chapter_14;

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;

        iOb = new NonGen(88);

        iOb.showType();

        int v = (Integer) iOb.getOb();

        System.out.println("value: " + v);
        System.out.println();

        NonGen strOb = new NonGen("Non-Generics test");
        strOb.showType();

        String str = (String) strOb.getOb();

        iOb = strOb;
        v = (Integer) iOb.getOb();  //runtime error
    }

}

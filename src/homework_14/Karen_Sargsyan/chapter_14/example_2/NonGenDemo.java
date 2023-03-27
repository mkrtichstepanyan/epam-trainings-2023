package homework_14.Karen_Sargsyan.chapter_14.example_2;

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;

        iOb = new NonGen(88);
        iOb.showType();

        int v = (Integer) iOb.getOb();
        System.out.println("value: " + v);
        System.out.println();

        NonGen strOb = new NonGen("Non-Generics Test");
        strOb.showType();

        String str = (String) strOb.getOb();
        System.out.println("value: " + str);

        iOb = strOb;
        v = (Integer) iOb.getOb();

    }

}

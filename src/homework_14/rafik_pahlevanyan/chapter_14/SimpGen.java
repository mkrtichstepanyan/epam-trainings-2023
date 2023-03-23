package homework_14.rafik_pahlevanyan.chapter_14;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");

        tgObj.showTypes();
        int v = tgObj.getOb1();
        System.out.println("value: " + v);

        String str = tgObj.getOb2();
        System.out.println("Value: " + str);
    }
}

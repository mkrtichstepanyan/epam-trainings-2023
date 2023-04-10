package homework_14.TatevKocharyan.chapter14;

public class SimpleGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Generics");
        tgObj.showTypes();
        int v = tgObj.getOb1();
        System.out.println("value:" + v);
        String str = tgObj.ob2;
        System.out.println("value" + str);
    }
}
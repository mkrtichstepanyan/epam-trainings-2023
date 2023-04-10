package homework_14.Shushanik_araqelyan;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Generics");
        tgObj.showTypes();
        int v = tgObj.getOb1();
        System.out.println("value:" + v);
        String str = tgObj.getOb2();
        System.out.println("Value :" + str);
    }
}

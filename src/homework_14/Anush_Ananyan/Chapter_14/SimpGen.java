package homework_14.Anush_Ananyan.Chapter_14;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> thObj = new TwoGen<Integer, String>(88, "Generics");

        thObj.showTypes();
        int v = thObj.getOb1();
        System.out.println("value: " + v);

        String str = thObj.getOb2();
        System.out.println("value " + str);
    }
}

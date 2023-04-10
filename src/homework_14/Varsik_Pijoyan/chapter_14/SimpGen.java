package homework_14.Varsik_Pijoyan.chapter_14;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgOb = new TwoGen<Integer, String>(88, "Generics");

        //Show the types
        tgOb.showType();

        //Obtain and show values
        int v = tgOb.getOb1();
        System.out.println("value: " + v);

        String str = tgOb.getOb2();
        System.out.println("value: " + str);

    }
}

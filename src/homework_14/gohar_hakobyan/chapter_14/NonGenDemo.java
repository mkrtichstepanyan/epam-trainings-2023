package homework_14.gohar_hakobyan.chapter_14;

public class NonGenDemo {
    public static void main(String[] args) {

        NonGen iOb = new NonGen(88);
        iOb.showType();

        int v = (Integer) iOb.getOb();
        System.out.println("Values: " + v);
        System.out.println();

        NonGen strOb = new NonGen("Non-Generics test");
        strOb.showType();
        String str = (String) strOb.getOb();
        System.out.println("Value: " + str);


        //This compiles, but is conseptually wrong!
        iOb = strOb;
        v = (Integer) iOb.getOb();

    }

}

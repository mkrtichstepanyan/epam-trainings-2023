package homework_14.rafik_pahlevanyan.chapter_14;

public class GenDemo {
    public static void main(String[] args) {
        //create a Gen reference for Integers
        Gen<Integer> iOb;

        iOb = new Gen<Integer>(88);

        //show the type of data used by iOb
        iOb.showType();

        int v = iOb.getOb();
        System.out.println("Value: " + v);
        System.out.println();

        //create a Gen object for String
        Gen<String> strOb = new Gen<String>("Generic Test");
        strOb.showType();

        String str = strOb.getOb();
        System.out.println("Value: " + str);
    }
}

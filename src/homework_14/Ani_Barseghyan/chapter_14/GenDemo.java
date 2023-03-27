package homework_14.Ani_Barseghyan.chapter_14;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;

        iOb = new Gen<Integer>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("value: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<String>("Generics test");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("value: " + str);
    }
}

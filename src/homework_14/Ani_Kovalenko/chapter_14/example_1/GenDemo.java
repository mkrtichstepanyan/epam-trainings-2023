package homework_14.Ani_Kovalenko.chapter_14.example_1;

public class GenDemo {
    public static void main(String[] args) {

        Gen<Integer> iOb = new Gen<Integer>(88);

        iOb.showType();
        int v = iOb.getOb();
        System.out.println("value: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<String>("Generics Test");

        strOb.showType();
        String str = strOb.getOb();
        System.out.println("value: " + str);
    }
}

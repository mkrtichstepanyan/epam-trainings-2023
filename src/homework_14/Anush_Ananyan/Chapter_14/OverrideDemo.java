package homework_14.Anush_Ananyan.Chapter_14;

public class OverrideDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(66);

        Gen3<Integer> iOb2 = new Gen3<Integer>(99);

        Gen3<String> strOb2 = new Gen3<String>("Generics Test");

        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(strOb2.getOb());
    }
}

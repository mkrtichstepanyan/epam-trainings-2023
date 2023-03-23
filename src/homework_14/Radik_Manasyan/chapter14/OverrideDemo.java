package homework_14.Radik_Manasyan.chapter14;

public class OverrideDemo {
    public static void main(String[] args) {
        OverrideGenMethod<Integer> iOb =
                new OverrideGenMethod<>(88);
        OverrideGenMethod2<Integer> iOb2 =
                new OverrideGenMethod2<>(99);
        OverrideGenMethod2<String> strOb2 =
                new OverrideGenMethod2<>("Generics test");

        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(strOb2.getOb());
    }
}

package homework_14.Ani_Kovalenko.chapter_14.example_10;

public class RawDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        Gen<String> strOb = new Gen<>("Generics Test");

        Gen raw = new Gen(98.6);
        double d = (Double) raw.getOb();
        System.out.println("value: " + d);

//        Error
//
//        int i = (Integer) raw.getOb();
//
//        strOb = raw;
//        String str = strOb.getOb();
//
//        raw = iOb;
//        d = (Double)raw.getOb();
    }
}

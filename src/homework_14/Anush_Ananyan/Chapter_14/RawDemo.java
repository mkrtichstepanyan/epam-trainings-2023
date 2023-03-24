package homework_14.Anush_Ananyan.Chapter_14;

import homework_6.gohar_hakobyan.chapter_8.D;

public class RawDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(88);

        Gen<String> strOb = new Gen<String>("Generics Test");

        Gen raw = new Gen(Double.valueOf(98.6));
        double d = (Double) raw.getOb();
        System.out.println("Value: " + d);

    }
}

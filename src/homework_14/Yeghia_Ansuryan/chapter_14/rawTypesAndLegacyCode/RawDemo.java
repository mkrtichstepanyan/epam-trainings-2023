package homework_14.Yeghia_Ansuryan.chapter_14.rawTypesAndLegacyCode;

public class RawDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(88);

        Gen<String> strOb = new Gen<String>("Generics Test");

        Gen raw= new Gen(Double.valueOf(98.6));
        double d =(Double) raw.getOb();
        System.out.println("value: " + d);

        strOb = raw;
        raw = iOb;
    }
}

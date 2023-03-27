package homework_14.Roza_Petrosyan.chapter_14.row_type;

public class RawDemo {
    public static void main(String[] args) {
        Gen<Integer> iob = new Gen<>(88);
        Gen<String> strOb = new Gen<>("Generics Test");
        Gen raw = new Gen<>(Double.valueOf(98.6));
//        strOb = raw;
//        raw = iob;

        double d = (Double) raw.getOb();
        System.out.println("value: " + d);
    }
}

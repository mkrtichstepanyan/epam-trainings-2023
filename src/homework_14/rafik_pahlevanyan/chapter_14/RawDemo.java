package homework_14.rafik_pahlevanyan.chapter_14;

public class RawDemo {
    public static void main(String[] args) {

        Gen<Integer> iob = new Gen<>(88);

        Gen<String> strob
                = new Gen<>("Generic test");
        Gen raw = new Gen<>(Double.valueOf(98.6));
        double d = (Double) raw.getOb();
        System.out.println("value: " + d);


//        Wrong
//        int i = (Integer) raw.getOb();
//        strob = raw;
//        String str = strob.getOb();
//
//        raw = iob;
//        d = (Double) raw.getOb();
    }
}

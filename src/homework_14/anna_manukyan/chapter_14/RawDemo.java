package homework_14.anna_manukyan.chapter_14;

public class RawDemo {
    public static void main(String[] args) {
        Generic<Integer> iOb = new Generic<Integer>(88);
        Generic<String> strOb = new Generic<>("Test of generic");

        Generic raw = new Generic (Double.valueOf(98.6));
        double d = (Double) raw.getOb();
        System.out.println("Value: " + d);


    }
}

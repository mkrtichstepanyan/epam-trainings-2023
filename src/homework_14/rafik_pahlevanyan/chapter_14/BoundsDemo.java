package homework_14.rafik_pahlevanyan.chapter_14;

public class BoundsDemo {
    public static void main(String[] args) {

        Integer[] inums = {1, 2, 3, 4, 5};

        Stats<Integer> iob = new Stats<>(inums);

        double v = iob.avg();
        System.out.println("iob avg is: " + v);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<>(dnums);

        double w = dob.avg();

        System.out.println("dob avg is: " + w);

        /*
        This won`t compile because String is not a subclass of Number

        String[] strs = {"1" , "2" ,"3", "4"};
        Stats<String> strob = new Stats<>(strs);

        double x = strob.avg();
        System.out.println("strob avg is " + x");
         */
    }
}

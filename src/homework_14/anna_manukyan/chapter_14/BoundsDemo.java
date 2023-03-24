package homework_14.anna_manukyan.chapter_14;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println("iob average is " + v);

        Double[] dnums = {1.0, 2.0, 3.0, 4.0, 5.0};
        Stats<Double> dob = new Stats<>(dnums);
        double w = dob.average();
        System.out.println("dob average is " + w);
    }
}

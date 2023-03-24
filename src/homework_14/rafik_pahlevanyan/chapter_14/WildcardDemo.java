package homework_14.rafik_pahlevanyan.chapter_14;

public class WildcardDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};

        Stats<Integer> iob = new Stats<>(inums);

        double v = iob.avg();
        System.out.println("iob avg is: " + v);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<>(dnums);

        double w = dob.avg();

        System.out.println("dob avg is: " + w);

        Float[] fnums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fob = new Stats<>(fnums);

        double x = fob.avg();
        System.out.println("fob avg is " + x);

        System.out.println("Average of iob and dob");
        if (iob.isSameAvg(dob)) {
            System.out.println("are the same");
        } else {
            System.out.println("differ");
        }

        System.out.println("Avg of iob and fob");
        if (iob.isSameAvg(fob)) {
            System.out.println("are the same");
        } else {
            System.out.println("differ");
        }
    }
}

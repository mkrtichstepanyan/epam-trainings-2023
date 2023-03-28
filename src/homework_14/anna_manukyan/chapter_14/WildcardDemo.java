package homework_14.anna_manukyan.chapter_14;

public class WildcardDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println("iob average is " + v);

        Double[] dnums = {1.0, 2.0, 3.0, 4.0, 5.0};
        Stats<Double> dob = new Stats<>(dnums);
        double w = dob.average();
        System.out.println("dob average is " + w);

        Float[] fnums = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        Stats<Float> fob = new Stats<>(fnums);
        double f = fob.average();
        System.out.println("fob average is " + f);

        System.out.println("Average of iob and dob");
        if (iob.isSameAvg(dob)) {
            System.out.println("are the same ");
        } else {
            System.out.println("differ");
        }

        System.out.println("Average of iob and fob");
        if (iob.isSameAvg(fob)) {
            System.out.println("are the same ");
        } else {
            System.out.println("differ");
        }

    }
}

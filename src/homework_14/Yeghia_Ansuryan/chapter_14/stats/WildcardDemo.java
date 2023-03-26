package homework_14.Yeghia_Ansuryan.chapter_14.stats;

public class WildcardDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("iob average is " + v);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("dob average is " + w);

        Float[] fnums = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        Stats<Float> fob = new Stats<Float>(fnums);
        double x = fob.average();
        System.out.println("fob average is " + x);

        System.out.println("Averages of iob and dob ");
        if (iob.isSameAvg(dob)) {
            System.out.println("are the same.");
        } else {
            System.out.println("differ.");
        }
        System.out.print("Averages of iob and fob ");
        if (iob.isSameAvg(fob)) {
            System.out.println("are the same.");
        } else {
            System.out.println("differ.");
        }
    }
}

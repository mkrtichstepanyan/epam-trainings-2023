package homework_14.Varsik_Pijoyan.chapter_14;

public class WildcardDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats1<Integer> iob = new Stats1<Integer>(inums);
        double v = iob.average();
        System.out.println("iob average is: " + v);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats1<Double> dob = new Stats1<Double>(dnums);
        double w = dob.average();
        System.out.println("dob average is: " + w);

        Float[] fnums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats1<Float> fob = new Stats1<Float>(fnums);
        double x = fob.average();
        System.out.println("fob average is: " + x);

        //See which arrays have same average
        System.out.println("Average of iob and dob.");
        if (iob.isSameAvg(dob))
            System.out.println("They are the same");
        System.out.println("they are different");

    }
}

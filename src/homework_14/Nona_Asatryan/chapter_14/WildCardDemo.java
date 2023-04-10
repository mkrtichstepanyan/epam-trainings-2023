package homework_14.Nona_Asatryan.chapter_14;

public class WildCardDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats2<Integer> iOb = new Stats2<Integer>(inums);
        double v = iOb.average();
        System.out.println("iOb average is " + v);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats2<Double> dOb = new Stats2<Double>(dnums);
        double w = dOb.average();
        System.out.println("dOb average is " + w);

        Float[] fnums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats2<Float> fOb = new Stats2<Float>(fnums);
        double x = fOb.average();
        System.out.println("fOb average is " + x);

        System.out.print("Averages of iob and dob ");
        if (iOb.isSameAvg(dOb)) {
            System.out.println("are the same.");
        } else {
            System.out.println("differ.");
        }

        System.out.print("Averages of iob and fob ");
        if (iOb.isSameAvg(fOb)) {
            System.out.println("are the same.");
        } else {
            System.out.println("differ.");
        }
    }
}

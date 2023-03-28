package homework_14.Nona_Asatryan.chapter_14;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats2<Integer> iOb = new Stats2<Integer>(inums);
        double v = iOb.average();
        System.out.println("iOb average is " + v);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats2<Double> dOb = new Stats2<Double>(dnums);
        double w = dOb.average();
        System.out.println("dOb average is " + w);

//        String[] strs = {"1", "2", "3", "4", "5"};
//        Stats2<String> strOb = new Stats2<String>(strs);
//
//        double x = strOb.average();
//        System.out.println("strOb average is " + v);
    }
}

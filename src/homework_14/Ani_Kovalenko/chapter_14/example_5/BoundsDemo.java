package homework_14.Ani_Kovalenko.chapter_14.example_5;

public class BoundsDemo {
    public static void main(String[] args) {

        Integer[] iNums = {1, 2, 3, 4, 5};
        Status<Integer> iOb = new Status<>(iNums);
        double v = iOb.average();
        System.out.println("iOb average is " + v);

        Double[] dNums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Status<Double> dOb = new Status<>(dNums);
        double w = dOb.average();
        System.out.println("dOb average is " + w);

        Float[] fNums = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        Status<Float> fOb = new Status<>(fNums);
        double f = fOb.average();
        System.out.println("fOb average is " + f);

        System.out.print("Averages if iOb and dOb ");
        if (iOb.isSameAvg(dOb)) {
            System.out.println("are the same.");
        } else {
            System.out.println("differ.");
        }

//        Error
//
//        String[] strs = {"1", "2", "3", "4", "5"};
//        Status<String> strOb = new Status <String> (strs);
//        double x = strOb.average();
//        System.out.println("strOb average is "+ x);
    }
}

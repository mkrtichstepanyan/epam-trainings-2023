package homework_14.gohar_hakobyan.chapter_14;

public class WildCardDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<Integer>(inums);
        double v = iOb.avarage();
        System.out.println("Avarage value of iOb " + v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dOb = new Stats<Double>(dnums);
        double w = dOb.avarage();
        System.out.println("Avarage value of dOb " + w);

        Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fOb = new Stats<Float>(fnums);
        double x = fOb.avarage();
        System.out.println("Avarage value of fOb " + x);

        System.out.println("Avarages of iOb & dOb ");
        if (iOb.sameAvg(dOb)) {
            System.out.println("Are the same. ");
        } else {
            System.out.println("Differ. ");
        }

        System.out.println("Avarages of iOb & fOb ");
        if (iOb.sameAvg(fOb)) {
            System.out.println("Are the same. ");
        } else {
            System.out.println("Differ. ");
        }
    }
}

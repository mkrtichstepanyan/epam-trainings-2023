package homework_14.gohar_hakobyan.chapter_14;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<>(inums);
        double v = iOb.avarage();
        System.out.println("Avarage value of iOb " + v);

        Double dnums[]={1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dOb =new Stats<>(dnums);
        double w = dOb.avarage();
        System.out.println("Avarage value of dOb " + w);

    }
}

package homework_14.Radik_Manasyan.chapter14;

public class WildcardDemo {
    public static void main(String[] args) {
        Integer[] iNums = {1, 2, 3, 4, 5};
        Stats2<Integer> iOb = new Stats2<>(iNums);
        double v = iOb.average();
        System.out.println("Среднее значение iOb равно " + v);

        Double[] dNums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats2<Double> dOb = new Stats2<>(dNums);
        double w = dOb.average();
        System.out.println("Среднее значение dOd равно " + w);


        Float[] fNums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats2<Float> fOb = new Stats2<>(fNums);
        double x = fOb.average();
        System.out.println("Среднее значение fOb равно " + x);

        System.out.println("Среднее значение iOb и dOb");
        if (iOb.sameAvg(dOb)){
            System.out.println("Равны.");
        }else {
            System.out.println("Отличаются.");
        }

        System.out.println("Среднее значение iOb и fOb");
        if (iOb.sameAvg(fOb)){
            System.out.println("Одинаковы.");
        }else {
            System.out.println("Отличаются.");
        }
    }
}

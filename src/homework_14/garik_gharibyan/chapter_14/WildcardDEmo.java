package homework_14.garik_gharibyan.chapter_14;

class Stats1<T extends Number> {
    T[] nums;

    Stats1(T[] nums) {
        this.nums = nums;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    boolean isSomeAverage(Stats1<?> stats) {
        return average() == stats.average();
    }
}

public class WildcardDEmo {
    public static void main(String[] args) {
        Integer[] iNums = {1, 2, 3, 4, 5};
        Stats1<Integer> iob = new Stats1<>(iNums);
        double v = iob.average();
        System.out.println("iob average is " + v);

        Double[] dNums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats1<Double> dob = new Stats1<>(dNums);
        double w = dob.average();
        System.out.println("dob average is " + w);

        Float[] fNums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats1<Float> fob = new Stats1<>(fNums);
        double f = fob.average();
        System.out.println("fob average is " + f);

        System.out.print("Averages of iob and dob");
        if (iob.isSomeAverage(dob)){
            System.out.println(" are the same.");
        }else {
            System.out.println(" differ");
        }
        System.out.print("Averages of iob and fob");
        if (iob.isSomeAverage(fob)){
            System.out.println(" are the same.");
        }else {
            System.out.println(" differ");
        }
    }
}

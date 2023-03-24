package homework_14.garik_gharibyan.chapter_14;

class Stats<T extends Number> {
    T[] nums;

    Stats(T[] nums) {
        this.nums = nums;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

}

public class BoundsDemo {
    public static void main(String[] args) {
        Integer[] iNums = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(iNums);
        double v = iob.average();
        System.out.println("iob average is " + v);

        Double[] dNums = {1.1, 2.2, 3.3, 4.4, 4.0};
        Stats<Double> dob = new Stats<>(dNums);
        double w = dob.average();
        System.out.println("dob average is " + w);

//        String[] sNums = {"1", "2", "3", "4", "5"};
//        Stats<String> strOb = new Stats<String>(sNums);
//        double s = strOb.average();
//        System.out.println(s);
    }
}

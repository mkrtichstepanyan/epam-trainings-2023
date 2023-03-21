package homework_14.gohar_hakobyan.chapter_14;

public class Stats<T extends Number> {
    T[] nums;

    Stats(T[] o) {
        nums = o;
    }

    double avarage() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();

        }
        return sum / nums.length;
    }

    boolean sameAvg(Stats<?> ob) {
        if (avarage() == ob.avarage()) {
            return true;
        }
        return false;
    }
}

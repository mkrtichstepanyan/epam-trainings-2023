package homework_14.rafik_pahlevanyan.chapter_14;

public class Stats<T extends Number> {
    T[] nums;

    Stats(T[] o) {
        nums = o;
    }

    double avg() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    boolean isSameAvg(Stats<?> ob) {
        if (avg() == ob.avg()) {
            return true;
        }
        return false;
    }
}

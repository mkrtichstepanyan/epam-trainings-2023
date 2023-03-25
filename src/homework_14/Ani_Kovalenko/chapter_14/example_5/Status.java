package homework_14.Ani_Kovalenko.chapter_14.example_5;

public class Status<T extends Number> {
    T[] nums;

    Status(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    boolean isSameAvg(Status<?> ob) {
        if (average() == ob.average()) {
            return true;
        }
        return false;
    }
}

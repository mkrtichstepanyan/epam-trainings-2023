package homework_14.rafik_pahlevanyan.chapter_14;

public class StatsWr<T> {
    T[] nums;

    StatsWr(T[] o) {
        nums = o;
    }

    double avg() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i].doubleValue();//Error
        }
        return sum / nums.length;
    }
}

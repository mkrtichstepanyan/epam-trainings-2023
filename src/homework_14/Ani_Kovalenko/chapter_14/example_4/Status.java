package homework_14.Ani_Kovalenko.chapter_14.example_4;

public class Status<T> {
    T[] nums;

    Status(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            //   sum += nums [i].doubleValue(); // compile error
        }
        return sum / nums.length;
    }
}

package homework_21.garik_gharibyan;

import java.util.ArrayList;
import java.util.Optional;

public class MyMath {
    public static long getMax(ArrayList<Long> list) {
        Optional<Long> max = list.stream().max(Long::compareTo);
        if (max.isPresent()) {
            return max.get();
        } else {
            throw new RuntimeException("not max value");
        }
    }

    public static long getMin(ArrayList<Long> list) {
        Optional<Long> min = list.stream().min(Long::compareTo);
        if (min.isPresent()) {
            return min.get();
        } else {
            throw new RuntimeException("not max value");
        }
    }

    public static long getAvg(ArrayList<Long> list) {
        long sum = 0;

        for (Long l : list) {
            sum = sum + l;
        }
        return sum / list.size();
    }
}

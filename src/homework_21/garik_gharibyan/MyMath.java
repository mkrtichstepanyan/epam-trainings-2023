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

    public static long getMedian(ArrayList<Long> list) {
        list.sort(Long::compareTo);

        if (list.size() % 2 == 0) {
            int medianIndex1 = list.size() / 2 - 1;
            int medianIndex2 = list.size() / 2 ;
            return (list.get(medianIndex1) + list.get(medianIndex2)) / 2;
        } else {
            int medianIndex = ((list.size() + 1) / 2) - 1;
            return list.get(medianIndex);
        }
    }
}

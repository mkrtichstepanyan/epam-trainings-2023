package homework_21.anna_manukyan.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MathFunctions {
    public static long getMax(List<Long> numbers) {
        Optional<Long> max = numbers.stream().max(Long::compareTo);
        if (max.isPresent()) {
            return max.get();
        } else {
            throw new NullPointerException("Array list is empty");
        }
    }

    public static long getMin(List<Long> numbers) {
        Optional<Long> min = numbers.stream().min(Long::compareTo);
        if (min.isPresent()) {
            return min.get();
        } else {
            throw new NullPointerException("Array list is empty");
        }
    }

    public static long getAvg(List<Long> numbers) {
        long average = 0;
        long sum = 0;
        if (numbers.size() > 0) {
            for (long number : numbers) {
                sum += number;
            }
            average = sum / numbers.size();
            return average;
        } else {
            throw new NullPointerException("Array list is empty");
        }
    }

    public static ArrayList<Long> getMedian(List<Long> numbers) {
        ArrayList<Long> medians = new ArrayList<>();
        if (numbers.size() > 0) {
            if (numbers.size() % 2 != 0) {
                long median = numbers.get(numbers.size() / 2 - 1);
                medians.add(median);
            } else {
                long median1 = numbers.get(numbers.size() / 2 - 1);
                medians.add(median1);
                long median2 = numbers.get(numbers.size() / 2);
                medians.add(median2);
            }
            return medians;
        } else {
            throw new NullPointerException("Array list is empty");
        }
    }
}

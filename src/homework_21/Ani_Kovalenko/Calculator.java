package homework_21.Ani_Kovalenko;

import java.util.List;

public class Calculator {

    static long calculateMin(List<Long> list) {
        return list.stream().min(Long::compare).orElse(0L);
    }

    static long calculateMax(List<Long> list) {
        return list.stream().max(Long::compare).orElse(0L);
    }

    static long calculateAvg(List<Long> list) {
        Long sum = list.stream().reduce(0L, (a, b) -> a + b);
        return sum / list.size();
    }

    static long calculateMedian(List<Long> list) {
        List<Long> sortedList = list.stream().sorted().toList();
        if ((sortedList.size() & 1) == 1) {
            System.out.println("true");
            return sortedList.get((sortedList.size() / 2) + 1);
        } else {
            long first = sortedList.get((sortedList.size() / 2) - 1);
            long second = sortedList.get((sortedList.size() / 2));
            return (first + second) / 2;
        }
    }
}

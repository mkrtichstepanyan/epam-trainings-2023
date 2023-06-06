package homework_21.hovhannes_gspeyan.util;

import homework_21.hovhannes_gspeyan.sortingApi.Type;

import java.util.List;
import java.util.LongSummaryStatistics;

public class CalculationUtility {
    private static LongSummaryStatistics lss = new LongSummaryStatistics();
    private static Type type;
    private final long min;
    private final long max;
    private final double avg;
    private final double median;

    public CalculationUtility(LongSummaryStatistics lss, Type type, long max, long min, double avg, double median) {
        CalculationUtility.lss = lss;
        CalculationUtility.type = type;
        this.min = min;
        this.max = max;
        this.avg = avg;
        this.median = median;
    }

    public static Type getType() {
        return type;
    }

    public static LongSummaryStatistics getStats() {
        return lss;
    }

    public static void setStats(LongSummaryStatistics lss) {
        CalculationUtility.lss = lss;
    }

    public long getMax() {
        return max;
    }

    public long getMin() {
        return min;
    }

    public double getMedian() {
        return median;
    }
    public double getAvg() {
        return avg;
    }
    public static double getMedian(List<Integer> sortedList) {
        double median;
        if (sortedList.isEmpty()) {
            throw new NullPointerException("List is empty! ");
        } else if (sortedList.size() % 2 == 1) {
            median = sortedList.get(sortedList.size() / 2);
        } else {
            int medianFirst = sortedList.get(sortedList.size() / 2 - 1);
            int medianSecond = sortedList.get(sortedList.size() / 2);
            median = (double) (medianFirst + medianSecond) / 2;
        }
        return median;
    }
}

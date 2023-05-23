package homework_21.gohar_hakobyan;

import homework_21.gohar_hakobyan.sorter.SortingTypes;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.LongSummaryStatistics;

public class RunStatistics {
    private static LongSummaryStatistics stats = new LongSummaryStatistics();

    private static SortingTypes type;
    private long max, min, median;
    private double average;


    public RunStatistics(LongSummaryStatistics stats, SortingTypes type, long max, long min, long median, double average) {
        this.stats = stats;
        this.type = type;
        this.max = max;
        this.min = min;
        this.median = median;
        this.average = average;
    }


    public static SortingTypes getType() {
        return type;
    }

    public static LongSummaryStatistics getStats() {
        return stats;
    }

    public static void setStats(LongSummaryStatistics stats) {
        RunStatistics.stats = stats;
    }

    public long getMax() {
        return max;
    }

    public long getMin() {
        return min;
    }

    public long getMedian() {
        return median;
    }


    public double getAverage() {
        return average;
    }

    public static int getMedian(List<Integer> list) {
        int length = list.size();
        if (length % 2 == 0) {
            int firstIndex = length / 2 - 1;
            int secondIndex = length / 2;
            return (list.get(firstIndex) + list.get(secondIndex)) / 2;
        } else {
            int medianIndex = ((length + 1) / 2) - 1;
            return list.get(medianIndex);
        }
    }

    public static void print(List<Integer> list) {
        //Before sorting
        System.out.println("Not sorted list" + list);
        SortingTypes[] values = SortingTypes.values();
        for (SortingTypes type : values) {
            System.out.println("Max value for " + type + ": -> " + stats.getMin());
            System.out.println("Min value for " + type + ": -> " + stats.getMin());
            System.out.println("Average value for " + type + ": -> " + stats.getAverage());
            System.out.println("Median for " + type + ": -> " + getMedian(list));
        }
    }

}

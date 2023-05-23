package homework_21.gohar_hakobyan;


import homework_21.gohar_hakobyan.sorter.SorterFactory;
import homework_21.gohar_hakobyan.sorter.SortingTypes;

import java.util.*;
import java.util.stream.Collectors;

import static homework_21.gohar_hakobyan.RunStatistics.*;
import static homework_21.gohar_hakobyan.sorter.SortPerformanceCalc.calculateSortingTime;
import static homework_21.gohar_hakobyan.sorter.SortPerformanceCalc.generateArray;

public class Demo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int length, attempts;

        System.out.print("Enter the length of array. ");
        length = console.nextInt();

        System.out.print("Enter the attempts count for sorting types.");
        attempts = console.nextInt();

        List<Integer> array = generateArray(length);
        Collections.shuffle(array);


        List<RunStatistics> statistics = Arrays.stream(SortingTypes.values())
                .map(type -> calculateSortingTime(array, attempts, SorterFactory.getSorter(type)))
                .map(longs -> longs.stream().mapToLong(value -> value).summaryStatistics())
                .map(stats -> new RunStatistics(stats, getType(), stats.getMax(), stats.getMin(), (long) stats.getAverage(),
                        getMedian(array))).toList();


        SortingTypes[] values = SortingTypes.values();
        for (SortingTypes type : values) {
            for (RunStatistics runStatistic : statistics) {
                System.out.println(type + "--->" + " max is " + runStatistic.getMax());
                System.out.println(" min is " + " -> " + runStatistic.getMin());
                System.out.println(" average is " + " -> " + runStatistic.getAverage());
                System.out.println(" median is " + " -> " + runStatistic.getMedian());
            }
            System.out.println();
        }
    }
}






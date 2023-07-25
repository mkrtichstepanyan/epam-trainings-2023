package homework_21.Ani_Kovalenko;

import homework_21.Ani_Kovalenko.algoritms.AlgorithmTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadLifeCycle {
    private static final int THREAD_COUNT = 4;
    private static final int ALGORITHM_COUNT = AlgorithmTypes.values().length;
    private final long[] resultsThread_1 = new long[ALGORITHM_COUNT];
    private final long[] resultsThread_2 = new long[ALGORITHM_COUNT];
    private final long[] resultsThread_3 = new long[ALGORITHM_COUNT];
    private final long[] resultsThread_4 = new long[ALGORITHM_COUNT];
    private long[] results;

    void organizeLifeCycle(int[] arrayToSort) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);
        for (int i = 0; i < 4; i++) {
            results = switch (i) {
                case 0 -> resultsThread_1;
                case 1 -> resultsThread_2;
                case 2 -> resultsThread_3;
                default -> resultsThread_4;
            };
            executorService.submit(new ThreadTask(arrayToSort, results));
        }
        Thread.sleep(10000);
        executorService.shutdown();
        try {
            if (executorService.awaitTermination(1000L, TimeUnit.MICROSECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
        Printer.printFirstLine();
        organize();
    }

    private void organize() {
        for (int i = 0; i < ALGORITHM_COUNT; i++) {
            List<Long> resultsList = listMaking(resultsThread_1[i], resultsThread_2[i],
                    resultsThread_3[i], resultsThread_4[i]);
            List<Long> calsList = callCalculator(resultsList);
            callPrinter(resultsList, calsList, i);
        }
    }

    private List<Long> callCalculator(List<Long> resultsList) {
        long min = Calculator.calculateMin(resultsList);
        long max = Calculator.calculateMax(resultsList);
        long avg = Calculator.calculateAvg(resultsList);
        long median = Calculator.calculateMedian(resultsList);
        return listMaking(min, max, avg, median);
    }


    private void callPrinter(List<Long> resultsList, List<Long> calsList, int i) {
        Printer.print(resultsList, calsList, i);
    }

    private List<Long> listMaking(long member_1, long member_2, long member_3, long member_4) {
        List<Long> list = new ArrayList<>(THREAD_COUNT);
        list.add(member_1);
        list.add(member_2);
        list.add(member_3);
        list.add(member_4);
        return list;
    }

}

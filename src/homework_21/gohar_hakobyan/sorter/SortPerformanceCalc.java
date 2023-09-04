package homework_21.gohar_hakobyan.sorter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SortPerformanceCalc {

    public static List<Integer> generateArray(int length) {
        List<Integer> generatedArray = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            generatedArray.add(i);
        }
        return generatedArray;
    }

    //Create Thread Pool for parallel operation
    public static List<Long> calculateSortingTime(List<Integer> generatedArray, int attempts, AbstractSorter sorter) {
        ExecutorService executorService = Executors.newFixedThreadPool(attempts);
        List<Long> runResults = new ArrayList<>();
        for (int i = 0; i < attempts; i++) {
            executorService.submit(() ->
                    runResults.add(sorter.getExecutionTime(new ArrayList<>(generatedArray))));
        }
        executorService.shutdown();
        return runResults;
    }

}

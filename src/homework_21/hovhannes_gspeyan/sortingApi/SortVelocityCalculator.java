package homework_21.hovhannes_gspeyan.sortingApi;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SortVelocityCalculator {

    public static List<Integer> generateArray(int length) {
        List<Integer> generatedArray = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            generatedArray.add(i);
        }
        return generatedArray;
    }

    public static List<Long> calculateSortingTime(List<Integer> generatedArray, int attempts, SortAndExecute arraySorter) {
        ExecutorService executorService = Executors.newFixedThreadPool(attempts);
        List<Long> runResultList = new ArrayList<>();
        for (int i = 0; i < attempts; i++) {
            executorService.submit(() -> runResultList.add(arraySorter.getTimeSpeed(new ArrayList<>(generatedArray))));
        }
        executorService.shutdown();
        return runResultList;
    }
}

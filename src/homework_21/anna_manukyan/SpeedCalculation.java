package homework_21.anna_manukyan;

import homework_21.anna_manukyan.sort.SortingAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SpeedCalculation {
    private int[] numbers;
    private int attemptsCount;
    private long time = 0;
    private List<Long> attemptsTime;

    public SpeedCalculation(int numbersCount, int attemptsCount) {
        this.attemptsCount = attemptsCount;
        this.numbers = new int[numbersCount];
        for (int i = 0; i < numbersCount; i++) {
            numbers[i] = i * new Random().nextInt(1_00_00);
        }
    }

    public List<Long> executeSort(SortingAlgorithm sortingAlgorithm) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        this.attemptsTime = new ArrayList<>();
        for (int i = 0; i < attemptsCount; i++) {
            long startTime = System.nanoTime();
            executorService.submit(() -> sortingAlgorithm.sort(numbers));
            long endTime = System.nanoTime();
            time = endTime - startTime;
            attemptsTime.add(time);
        }
        return attemptsTime;
    }

}

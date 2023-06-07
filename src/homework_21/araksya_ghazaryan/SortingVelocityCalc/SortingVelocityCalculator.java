package homework_21.araksya_ghazaryan.SortingVelocityCalc;

import java.util.Arrays;

public class SortingVelocityCalculator {
    public static void main(String[] args) {
        int arrayLength = 1500;
        int attempts = 4;

        int[] array = ArrayGenerator.generateArray(arrayLength);
        System.out.println("Generated Array: " + Arrays.toString(array));

        SortingResults results = calculateSorting(array, attempts);
        results.printResults();
    }
    private static SortingResults calculateSorting(int[] array, int attempts) {
        SortingAlgorithm[] algorithms = {new BubbleSort(), new SelectionSort(), new QuickSort(), new MergeSort()
        };

        int[][] sortingTimes = new int[algorithms.length][attempts];
        for (int i = 0; i < algorithms.length; i++) {
            SortingAlgorithm algorithm = algorithms[i];
            for (int j = 0; j < attempts; j++) {
                int[] copy = Arrays.copyOf(array, array.length);
                long startTime = System.nanoTime();
                algorithm.sort(copy);
                long endTime = System.nanoTime();
                sortingTimes[i][j] = (int)((endTime - startTime) / 1_000_000);
            }
        }
        return new SortingResults(algorithms, sortingTimes, attempts);
    }
}
package homework_21.Alina_Mkhoyan;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SortingVelocityCalculator {
    public static void main(String[] args) {
        int arrayLength = 1500;
        int numAttempts = 4;

        ExecutorService executor = Executors.newFixedThreadPool(4);
        try {
            int[][] results = new int[4][numAttempts];
            int[] array = generateRandomArray(arrayLength);
            for (int i = 0; i < 4; i++) {
                SortingAlgorithm algorithm;
                switch (i) {
                    case 0:
                        algorithm = new BubbleSort();
                        break;
                    case 1:
                        algorithm = new SelectionSort();
                        break;
                    case 2:
                        algorithm = new QuickSort();
                        break;
                    case 3:
                        algorithm = new MergeSort();
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + i);
                }

                for (int j = 0; j < numAttempts; j++) {
                    int[] arrayCopy = Arrays.copyOf(array, arrayLength);

                    int finalI = i;
                    int finalJ = j;
                    executor.submit(() -> {
                        long startTime = System.nanoTime();
                        algorithm.sort(arrayCopy);
                        long endTime = System.nanoTime();

                        results[finalI][finalJ] = (int) ((endTime - startTime) / 1_000_000);
                    });
                }
            }

            executor.shutdown();
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);

            String[] algorithmNames = {"bubble", "selection", "quick", "merge"};
            System.out.println("Array length - " + arrayLength + ", attempts (parallel runs) - " + numAttempts);
            System.out.println("          | run 1 | run 2 | run 3 | run 4 |  min  |  max  |  avg  | median");
            for (int i = 0; i < 4; i++) {
                System.out.print(String.format("%-10s", algorithmNames[i]));
                int[] algorithmResults = results[i];
                Arrays.sort(algorithmResults);

                int sum = 0;
                for (int result : algorithmResults) {
                    sum += result;
                    System.out.print(String.format("| %5d ", result));
                }

                int min = algorithmResults[0];
                int max = algorithmResults[numAttempts - 1];
                int avg = sum / numAttempts;
                int median = numAttempts % 2 == 0 ? (algorithmResults[numAttempts / 2] +
                        algorithmResults[numAttempts / 2 - 1]) / 2 : algorithmResults[numAttempts / 2];
                System.out.println(String.format("| %5d | %5d | %5d | %5d", min, max, avg, median));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static int[] generateRandomArray(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }
}


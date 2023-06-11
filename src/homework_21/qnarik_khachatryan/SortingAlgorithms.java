package homework_21.qnarik_khachatryan;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class SortingAlgorithms {
    public static void main(String[] args) {
        calculateSpeed(1500, 4);

    }

    public static void calculateSpeed(int arrayLength, int attempts) {

        int algorithmQuantity = SortingTypes.values().length;
        ExecutorService executor = Executors.newFixedThreadPool(4);
        try {
            int[][] results = new int[algorithmQuantity][attempts];
            ArrayList<Integer> generatedArray = IntegerList.generateArrayList(arrayLength);
            for (SortingTypes types : SortingTypes.values()) {
                AbstractSorter sorterAlgorithm;
                switch (types) {
                    case BUBBLE:
                        sorterAlgorithm = new BubbleSorter();
                        break;
                    case SELECTION:
                        sorterAlgorithm = new SelectionSorter();
                        break;
                    case MERGE:
                        sorterAlgorithm = new MergeSorter();
                        break;
                    case QUICK:
                        sorterAlgorithm = new QuickSorter();
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value");
                }

                for (int j = 0; j < attempts; j++) {
                    ArrayList<Integer> arrayCopy = new ArrayList<>(generatedArray);
                    int finalI = types.ordinal();
                    int finalJ = j;
                    executor.submit(() -> {
                        long startTime = System.nanoTime();
                        sorterAlgorithm.sort(arrayCopy);
                        long endTime = System.nanoTime();
                        results[finalI][finalJ] = (int) ((endTime - startTime) / 10_000);
                    });
                }
            }

            executor.shutdown();
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);

            Printer printer = new Printer();
            printer.print(arrayLength, attempts, results);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

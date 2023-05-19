package homework_21.Radik_Manasyan;

import homework_21.Radik_Manasyan.sortMethods.BubbleSort;
import homework_21.Radik_Manasyan.sortMethods.InsertionSort;
import homework_21.Radik_Manasyan.sortMethods.MergeSort;
import homework_21.Radik_Manasyan.sortMethods.SelectionSort;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RunnerMethods {

    public void startSorting(int arrayLength, int attempts) {

        int[] listIntegers = GenerateRandomIntegers.getListIntegers(arrayLength);

        BubbleSort bubbleSort = new BubbleSort(listIntegers, attempts);
        InsertionSort insertionSort = new InsertionSort(listIntegers, attempts);
        MergeSort mergeSort = new MergeSort(listIntegers, attempts);
        SelectionSort selectionSort = new SelectionSort(listIntegers, attempts);

        Thread threadBubbleSort = new Thread(bubbleSort);
        Thread threadInsertionSort = new Thread(insertionSort);
        Thread threadMergeSort = new Thread(mergeSort);
        Thread threadSelectionSort = new Thread(selectionSort);


        threadBubbleSort.start();
        threadInsertionSort.start();
        threadMergeSort.start();
        threadSelectionSort.start();


        try {
            threadBubbleSort.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Array length - " + arrayLength + ", attempts (parallel runs) - " + attempts);
        System.out.println();

        System.out.print("Sort method    |");
        for (int i = 0; i < attempts; i++) {
            System.out.printf("run %-5s|", (i + 1));
        }
        System.out.print(" min | max | avg | medium \n");

        bubbleSort.getSortingTimeResult("bubbleSort");
        selectionSort.getSortingTimeResult("selectionSort");
        insertionSort.getSortingTimeResult("insertionSort");
        mergeSort.getSortingTimeResult("mergeSort");

    }

    private static class GenerateRandomIntegers {
        private static final Random random = new Random();


        public static int[] getListIntegers(int arrayLength) {
            try {
                return randomDigits(arrayLength);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            return null;
        }

        private static int[] randomDigits(int countDigit) {
            List<Integer> listIntegers = new LinkedList<>();

            if (countDigit > 1_000_000 || countDigit <= 0) {
                throw new IllegalArgumentException("Cannot be greater than 1_000_000 and less than 0.");
            } else {
                for (int i = 0; i < countDigit; i++) {
                    listIntegers.add(random.nextInt(countDigit));
                }
            }
            return listIntegers.stream().mapToInt(Integer::intValue).toArray();

        }
    }
}

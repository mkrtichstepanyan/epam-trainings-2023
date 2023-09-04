package homework_21.Nona_Asatryan.sorting_algorithms;

import homework_21.Nona_Asatryan.SortingAlgorithms;

import java.util.List;

public class BubbleSort extends SortingAlgorithms {
    public BubbleSort(int[] array, int attempts) {
        super(array, attempts);
    }

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                swap(array, j);
            }
        }
        return array;
    }

    private static void swap(int[] array, int index) {
        if (array[index] > array[index + 1]) {
            int temp = array[index];
            array[index] = array[index + 1];
            array[index + 1] = temp;
        }
    }

    @Override
    public void sort(int[] array) {
        bubbleSort(array);
    }
}

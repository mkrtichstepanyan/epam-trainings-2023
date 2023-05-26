package homework_21.Nona_Asatryan.sorting_algorithms;

import homework_21.Nona_Asatryan.SortingAlgorithms;

public class SelectionSort extends SortingAlgorithms {
    public SelectionSort(int[] array, int attempts) {
        super(array, attempts);
    }

    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
        }
    }

    @Override
    public void sort(int[] array) {
        selectionSort(array);
    }
}

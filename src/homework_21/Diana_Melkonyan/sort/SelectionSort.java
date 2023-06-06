package homework_21.Diana_Melkonyan.sort;

import homework_21.Diana_Melkonyan.SortingAlgoritms;

public class SelectionSort extends SortingAlgoritms {
    public SelectionSort(int[] array, int attempts) {
        super(array, attempts);
    }

    private static void selection_sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min_index] > arr[j])
                    min_index = j;

            }
            swap(i, min_index, arr);
        }
    }
    private static void swap ( int i, int min_index, int[] arr){
        int temp = arr[i];
        arr[i] = arr[min_index];
        arr[min_index] = temp;
    }

    @Override
    public void sort(int[] array) {
        selection_sort(array);
    }
}

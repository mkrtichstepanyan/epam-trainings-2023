package homework_21.Nona_Asatryan.sorting_algorithms;


import homework_21.Nona_Asatryan.SortingAlgorithms;

public class QuickSort extends SortingAlgorithms {
    public QuickSort(int[] array, int attempts) {
        super(array, attempts);
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    @Override
    public void sort(int[] array) {
        quickSort(array,5, 4);
    }
}




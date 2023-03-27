package homework_15.Nona_Asatryan.sorting_algorithms;

import java.util.Arrays;

import static homework_15.Nona_Asatryan.sorting_algorithms.BubbleSort.*;
import static homework_15.Nona_Asatryan.sorting_algorithms.InsertionSort.insertionSort;
import static homework_15.Nona_Asatryan.sorting_algorithms.MergeSort.mergeSort;
import static homework_15.Nona_Asatryan.sorting_algorithms.SelectionSort.selectionSort;

public class SortingTest {
    public static void main(String[] args) {
        int[] array = {4, 1, -1, 6, 33, 41, 66, -2, 0, 5};
        bubbleSort(array);
        selectionSort(array);
        insertionSort(array);
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}

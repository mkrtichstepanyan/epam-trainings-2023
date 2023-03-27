package homework_15.hovhannes_gspeyan.sorting_algorithms;

import java.util.Arrays;

import static homework_15.hovhannes_gspeyan.sorting_algorithms.BubbleSort.bubbleSort;
import static homework_15.hovhannes_gspeyan.sorting_algorithms.InsertionSort.insertionSort;
import static homework_15.hovhannes_gspeyan.sorting_algorithms.MergeSort.mergeSort;
import static homework_15.hovhannes_gspeyan.sorting_algorithms.SelectionSort.selectionSort;

public class SortingDemo {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 6, 3, 8, 0, 4};
        bubbleSort(arr);
        insertionSort(arr);
        selectionSort(arr);
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

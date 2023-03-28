package homework_15.rafik_pahlevanyan.sorting_algorithms;

import java.util.Arrays;

public class InsertionSort {
    
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 3, 6, 1, 8, 7, 4};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

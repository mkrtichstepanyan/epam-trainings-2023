package homework_15.rafik_pahlevanyan.sorting_algorithms;

import java.util.Arrays;

public class SelectionSort {
    
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 3, 6, 1, 8, 7, 4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

package homework_15.rafik_pahlevanyan.sorting_algorithms;

import java.util.Arrays;

public class MergeSort {
    
    public static void mergesort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergesort(arr, left, mid);
            mergesort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    
    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[arr.length];
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }
        
        int i = left;
        int j = mid + 1;
        int k = left;
        
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        
        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 3, 6, 1, 8, 7, 4};
        mergesort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}

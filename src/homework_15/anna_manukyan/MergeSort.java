package homework_15.anna_manukyan;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 9, 1, 4, 3, 7, 21, 22, -96};
        for (int i : sortArray(arr)) {
            System.out.print(i + ", ");
        }
    }

    public static int[] sortArray(int[] arr) {
        int[] left = Arrays.copyOf(arr, arr.length / 2);
        int[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
        if (left.length >= 1 && right.length >= 1) {
            swap(left);
            swap(right);
            sortArray(left);
            sortArray(right);
            merge(arr, left, right);
        }
        return arr;
    }

    private static void swap(int[] arr) {
        int tmp = 0;
        if (arr.length > 1) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
    }

    private static int[] merge(int[] arr, int[] left, int[] right) {
        int index = 0;
        int i = 0;
        int j = 0;
        while (j < right.length && i < left.length) {
            if (left[i] < right[j]) {
                arr[index++] = left[i];
                i++;
            } else {
                arr[index++] = right[j];
                j++;
            }
        }
        if (j == right.length && i != left.length) {
            for (int k = i; k < left.length; k++) {
                arr[index++] = left[k];
            }
        }
        if (i == left.length && j != right.length) {
            for (int k = j; k < right.length; k++) {
                arr[index++] = right[k];
            }

        }
        return arr;
    }
}

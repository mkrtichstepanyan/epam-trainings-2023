package homework_21.Radik_Manasyan.sortMethods;

import homework_21.Radik_Manasyan.SortingVelocitySpeed;

import java.util.Arrays;

public class MergeSort extends SortingVelocitySpeed {

    public MergeSort(int[] array, int attempts) {
        super(array, attempts);
    }

    @Override
    public void sort(int[] array) {
        mergeSort(array);
    }

    private void mergeSort(int[] array, int arrayLength) {
        int mid = arrayLength / 2;

        if (arrayLength < 2) {
            return;
        }
        int[] left = new int[mid];
        int[] right = new int[arrayLength - mid];

        System.arraycopy(array, 0, left, 0, mid);
        if (arrayLength - mid >= 0) System.arraycopy(array, mid, right, 0, arrayLength - mid);
        mergeSort(left, mid);
        mergeSort(right, arrayLength - mid);

        merge(array, left, right, mid, arrayLength - mid);
    }

    private void merge(
            int[] array, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                array[k++] = l[i++];
            } else {
                array[k++] = r[j++];
            }
        }
        while (i < left) {
            array[k++] = l[i++];
        }
        while (j < right) {
            array[k++] = r[j++];
        }
    }

    private void mergeSort(int[] array) {
        int[] copy = Arrays.stream(array).toArray();
        mergeSort(copy, copy.length);
    }
}
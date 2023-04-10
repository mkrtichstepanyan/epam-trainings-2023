package homework_15.Anush_Ananyan;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] array) {

        if (array.length < 2) {
            return array;
        }
        int half = array.length / 2;
        int[] leftPart = Arrays.copyOfRange(array, 0, half);
        int[] rightPart = Arrays.copyOfRange(array, half, array.length);

        mergeSort(leftPart);
        mergeSort(rightPart);
        merge(array, leftPart, rightPart);

        return array;
    }

    public static void merge(int[] array, int[] leftPart, int[] rightPart) {
        int lSize = leftPart.length;
        int rSize = rightPart.length;
        int i = 0, j = 0, k = 0;

        while (i < lSize && j < rSize) {
            if (leftPart[i] <= rightPart[j]) {
                array[k] = leftPart[i];
                i++;
            } else {
                array[k] = rightPart[j];
                j++;
            }
            k++;
        }

        for (int li = i; li < lSize; li++) {
            array[k++] = leftPart[li];
        }
        for (int rj = j; rj < rSize; rj++) {
            array[k++] = rightPart[rj];
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 25, -2, 0, 6, 9, -5};
        printArray(mergeSort(array));
    }
}

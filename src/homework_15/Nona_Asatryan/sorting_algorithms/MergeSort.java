package homework_15.Nona_Asatryan.sorting_algorithms;

public class MergeSort {
    public static void mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int mid = array.length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[array.length - mid];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = array[i];
        }

        for (int i = mid; i < array.length; i++) {
            rightArray[i - mid] = array[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                array[resultIndex++] = leftArray[leftIndex++];
            } else {
                array[resultIndex++] = rightArray[rightIndex++];
            }
        }

        while (leftIndex < leftArray.length) {
            array[resultIndex++] = leftArray[leftIndex++];
        }

        while (rightIndex < rightArray.length) {
            array[resultIndex++] = rightArray[rightIndex++];
        }
    }

}

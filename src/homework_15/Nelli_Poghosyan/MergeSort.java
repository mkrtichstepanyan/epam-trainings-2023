package homework_15.Nelli_Poghosyan;

public class MergeSort {
    public static int[] mergeSort(int[] array, int n) {
        if (n < 2) {
            return null;
        }
        int midIndex = n / 2;
        int leftArray[] = new int[midIndex];
        int rightArray[] = new int[n - midIndex];
        for (int i = 0; i < midIndex; i++) {
            leftArray[i] = array[i];
        }
        for (int i = midIndex; i < n; i++) {
            rightArray[i - midIndex] = array[i];
        }
        mergeSort(leftArray, midIndex);
        mergeSort(rightArray, n - midIndex);
        merge(array, leftArray, rightArray, midIndex, n - midIndex);
        return array;
    }

    public static int[] merge(int[] array, int[] leftArray, int[] rightArray, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < left) {
            array[k++] = leftArray[i++];
        }
        while (j < right) {
            array[k++] = rightArray[j++];
        }
        return array;
    }

    public static void main(String[] args) {
        int array[] = {12, 21, 14, 31, 41, 1, 17,};
        mergeSort(array, array.length);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}

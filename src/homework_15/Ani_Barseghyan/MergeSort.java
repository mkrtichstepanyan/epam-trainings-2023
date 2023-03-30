package homework_15.Ani_Barseghyan;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {9, 1, 2, 6, 8, 5, 3, 0, 4, 7};
        printArray(mergeSort(array, 0, array.length - 1));
    }

    public static void merge(int[] array, int left, int mid, int right) {

        int leftLength = mid - left + 1;
        int rightLength = right - mid;

        int[] leftArr = new int[leftLength];
        int[] rightArr = new int[rightLength];

        for (int i = 0; i < leftLength; i++) {
            leftArr[i] = array[left + i];
        }
        for (int i = 0; i < rightLength; i++) {
            rightArr[i] = array[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < leftLength && j < rightLength) {
            if (leftArr[i] <= rightArr[j]) {
                array[k] = leftArr[i];
                i++;
            } else {
                array[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < leftLength) {
            array[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightLength) {
            array[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static int[] mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
        return array;
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

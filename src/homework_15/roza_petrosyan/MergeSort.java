package homework_15.roza_petrosyan;
public class MergeSort {
    public static void main(String[] args) {
        int[] array = {0, 1, -1, 25, 7, -15};
        int[] merged = sort(array, 0, array.length - 1);
        printArray(merged);
    }

    public static int[] mergeTwoSortedArrays(int[] left, int[] right) {
        int[] sortedArray = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                sortedArray[k] = left[i];
                k++;
                i++;
            } else {
                sortedArray[k] = right[j];
                k++;
                j++;
            }
        }

        if (i == left.length) {
            while (j < right.length) {
                sortedArray[k] = right[j];
                k++;
                j++;
            }
        }

        if (j == right.length) {
            while (i < left.length) {
                sortedArray[k] = left[i];
                k++;
                i++;
            }
        }
        return sortedArray;
    }

    public static int[] sort(int[] array, int startIndex, int lastIndex) {
        if (startIndex == lastIndex) {
            int[] singleItemArray = new int[1];
            singleItemArray[0] = array[startIndex];
            return singleItemArray;
        }

        int middle = (startIndex + lastIndex) / 2;
        int[] left = sort(array, startIndex, middle);
        int[] right = sort(array, middle + 1, lastIndex);
        int[] mergedArray = mergeTwoSortedArrays(left, right);

        return mergedArray;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int item : array) {
            System.out.print(" " + item + " ");
        }
        System.out.print(']');
    }
}

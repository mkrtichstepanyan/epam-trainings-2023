package homework_15.roza_petrosyan;
public class MergeSort {
    public static void main(String[] args) {
        int[] array = {0, 1, -1, 25, 7, -15};
        int[] merged = sort(array, 0, array.length - 1);
        printArray(merged);
    }

    public static int[] mergeTwoSortedArrays(int[] first, int[] second) {
        int[] sorted = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                sorted[k] = first[i];
                k++;
                i++;
            } else {
                sorted[k] = second[j];
                k++;
                j++;
            }
        }

        if (i == first.length) {
            while (j < second.length) {
                sorted[k] = second[j];
                k++;
                j++;
            }
        }

        if (j == second.length) {
            while (i < first.length) {
                sorted[k] = first[i];
                k++;
                i++;
            }
        }
        return sorted;
    }

    public static int[] sort(int[] arr, int lo, int hi) {
        if (lo == hi) {
            int[] br = new int[1];
            br[0] = arr[lo];
            return br;
        }

        int mid = (lo + hi) / 2;
        int[] left = sort(arr, lo, mid);
        int[] right = sort(arr, mid + 1, hi);
        int[] merged = mergeTwoSortedArrays(left, right);

        return merged;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int item : array) {
            System.out.print(" " + item + " ");
        }
        System.out.print(']');
    }
}

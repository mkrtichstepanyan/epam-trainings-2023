package homework_21.anna_manukyan.sort;

public class SelectionSort implements SortingAlgorithm {
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_id = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_id]) {
                    min_id = j;
                }
                swap(arr, i, min_id);
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}

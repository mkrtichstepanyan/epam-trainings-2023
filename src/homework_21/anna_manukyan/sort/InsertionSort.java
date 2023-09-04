package homework_21.anna_manukyan.sort;

public class InsertionSort implements SortingAlgorithm {
    public int[] sort(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i;
            while (arr[j + 1] < arr[j]) {
                swap(arr, j);
                count++;
                j--;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int index) {
        int tmp = arr[index];
        arr[index] = arr[index + 1];
        arr[index + 1] = tmp;

    }
}

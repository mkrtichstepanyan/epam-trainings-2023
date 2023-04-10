package homework_15.Nona_Asatryan.sorting_algorithms;

public class InsertionSort {
    public static void insertionSort (int[] array) {
        for (int i = 1; i < array.length; i++) {
            int n = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > n) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = n;
        }
    }
}

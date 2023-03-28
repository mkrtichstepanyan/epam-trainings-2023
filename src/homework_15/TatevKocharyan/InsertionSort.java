package homework_15.TatevKocharyan;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && temp <= array[j]) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }

    }
}

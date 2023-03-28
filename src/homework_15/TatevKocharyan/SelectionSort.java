package homework_15.TatevKocharyan;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = array[i];
                if (temp > array[j]) {
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
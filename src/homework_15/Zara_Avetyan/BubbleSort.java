package homework_15.Zara_Avetyan;

public class BubbleSort {
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                swap(array, j);
            }
        }
        return array;
    }

    public static void swap(int[] array, int j) {
        int temp;
        if (array[j] > array[j + 1]) {
            temp = array[j + 1];
            array[j + 1] = array[j];
            array[j] = temp;
        }
    }
}

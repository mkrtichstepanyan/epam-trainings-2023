package homework_15.karen_mikayelyan;

public class InsertionSort {

    public static int[] sortInsertion(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            for (int j = i - 1; j >= 0 && tmp < array[j]; j--) {
                array[j + 1] = array[j];
                array[j] = tmp;
            }
        }
        return array;
    }
}

package homework_15.Vahe_Vardanyan;

public class InsertionSort {
    public static int[] InsertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            for (int j = i - 1; j > 0 && temp < array[j]; j--) {
                array[j + 1] = array[j];
                array[j] = temp;

            }

        }
        return array;
    }
}

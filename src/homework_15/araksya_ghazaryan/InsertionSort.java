package homework_15.araksya_ghazaryan;

public class InsertionSort {
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int temp = array[i];
            for (int j = i - 1; j >= 0 && array[j] > temp; j--) {
                array[j + 1] = array[j];
                array[j] = temp;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {3, 6, 0, 5, 2, 4, 20, 5};
        insertionSort(array);
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
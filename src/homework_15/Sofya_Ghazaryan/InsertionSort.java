package homework_15.Sofya_Ghazaryan;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        int size = array.length;
        int count = 0;

        for (int i = 1; i < size; i++) {
            count++;
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        System.out.println("count -> " + count);
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}

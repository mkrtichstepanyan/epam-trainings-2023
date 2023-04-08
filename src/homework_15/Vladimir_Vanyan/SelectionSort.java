package homework_15.Vladimir_Vanyan;

public class SelectionSort {
    static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < array.length; j++) {

                if (array[minValueIndex] > array[j]) {
                    minValueIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minValueIndex];
            array[minValueIndex] = temp;
        }
        return array;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 25, -2, 0, 6, 9, -5};
        printArray(sort(array));
    }
}
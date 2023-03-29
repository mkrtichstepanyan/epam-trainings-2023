package homework_15.Anush_Ananyan;

public class BubbleSort {

    public static int[] sort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                count++;
                swap(array, j);
            }
        }
        System.out.println("Count: " + count);
        return array;
    }

    private static void swap(int[] array, int index) {
        if (array[index] > array[index + 1]) {
            int temp = array[index];
            array[index] = array[index + 1];
            array[index + 1] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public static void main(String[] args) {
        int[] array = {10, 25, -2, 0, 6, 9, -5};
        printArray(sort(array));
    }
}

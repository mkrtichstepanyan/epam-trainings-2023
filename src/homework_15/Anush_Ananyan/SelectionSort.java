package homework_15.Anush_Ananyan;

public class SelectionSort {

    public static int[] sort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                count++;
                if (array[minValueIndex]> array[j] ) {
                    minValueIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minValueIndex];
            array[minValueIndex] = temp;
        }
        System.out.println("Count: " + count);
        return array;
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

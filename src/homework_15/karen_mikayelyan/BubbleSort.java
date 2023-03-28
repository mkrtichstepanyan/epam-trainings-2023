package homework_15.karen_mikayelyan;

public class BubbleSort {

    public static int[] sortBubble(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                count++;
                swap(array, j);
            }
        }
        System.out.println("count : " + count);
        return array;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }

    public static void swap(int[] array, int index) {
        if (array[index] > array[index + 1]) {
            int tmp = array[index];
            array[index] = array[index + 1];
            array[index + 1] = tmp;
        }
    }
}




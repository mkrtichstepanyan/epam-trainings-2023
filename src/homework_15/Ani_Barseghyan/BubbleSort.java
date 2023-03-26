package homework_15.Ani_Barseghyan;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {9, 1, 2, 6, 8, 5, 3, 0, 4, 7};
        printArray(sort(array));
    }

    public static int[] sort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                count++;
                swap(array, j);
            }
        }
        System.out.println("count -> " + count);
        return array;
    }

    public static void swap(int[] array, int index) {
        if (array[index] > array[index + 1]) {
            int temp = array[index];
            array[index] = array[index + 1];
            array[index + 1] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}

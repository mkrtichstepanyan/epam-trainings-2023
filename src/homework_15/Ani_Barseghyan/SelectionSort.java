package homework_15.Ani_Barseghyan;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {9, 1, 2, 6, 8, 5, 3, 0, 4, 7};
        printArray(sort(array));
    }

    public static int[] sort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                count++;
                swap(array, j, minIndex);
            }
        }
        System.out.println("count -> " + count);
        return array;
    }

    public static void swap(int[] array, int index, int minIndex) {
        if (array[index] < array[minIndex]) {
            int temp = array[index];
            array[index] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}

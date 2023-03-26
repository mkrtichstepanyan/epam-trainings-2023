package homework_15.Ani_Barseghyan;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {9, 1, 2, 6, 8, 5, 3, 0, 4, 7};
        printArray(sort(array));
    }

    public static int[] sort(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length - 1; i++) {
            count++;
            swap(array, i);
        }
        System.out.println("count -> " + count);
        return array;
    }

    public static void swap(int[] array, int index) {
        int min = array[index];
        int j = index - 1;
        while (j >= 0 && array[j] > min) {
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = min;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}

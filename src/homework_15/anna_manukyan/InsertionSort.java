package homework_15.anna_manukyan;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 6, 2, 7, 4};
        printArray(sortArray(arr));
    }

    static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i;
            while (arr[j + 1] < arr[j]) {
                swap(arr, j);
                j--;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int index) {
        int tmp = arr[index];
        arr[index] = arr[index + 1];
        arr[index + 1] = tmp;

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}

package homework_15.anna_manukyan;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 6, 2, 7, 4};
        printArray(sortArray(arr));
    }

    static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_id = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_id]) {
                    min_id = j;
                }
                swap(arr, i, min_id);
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}

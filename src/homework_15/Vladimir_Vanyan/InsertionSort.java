package homework_15.Vladimir_Vanyan;

public class InsertionSort {
    static int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        return array;
    }

    static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 9, 14, 10, 6, 1, 17, 20};
        printArray(sort(numbers));
    }
}

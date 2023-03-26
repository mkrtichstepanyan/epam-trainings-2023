package homework_15.Anush_Ananyan;

public class InsertionSort {

    public static int[] sort(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
                count++;
            }
            array[j + 1] = temp;
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
        int array[] = {10, 25, -2, 0, 6, 9, -5};
        printArray(sort(array));
    }
}

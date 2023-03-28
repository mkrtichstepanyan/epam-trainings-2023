package homework_15.ofelya_khachatryan;

public class InsertionSort {

    public void sort(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {19, 7, 6, 90, 2, 0, 45, 1, 8, 11};
        InsertionSort ob = new InsertionSort();
        ob.sort(array);

        printArray(array);
    }

}

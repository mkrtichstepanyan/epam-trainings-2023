package homework_15.ofelya_khachatryan;

public class SelectionSort {

    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public void printArray(int array[]) {
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        int[] array = {1, 0, 7, 3, 2, 5, 8, 6, 9, 4};
        ob.sort(array);
        ob.printArray(array);
    }
}

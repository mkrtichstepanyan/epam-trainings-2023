package homework_15.Lilit_Adamyan;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {2, 25, 0, 78, 16, 12, 5, 64};
        System.out.print("Before SelectionSort: ");
        printArray(array);
        System.out.print("After SelectionSort: ");
        printArray(selectionSort(array));
    }


    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;

                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

        }
        return array;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

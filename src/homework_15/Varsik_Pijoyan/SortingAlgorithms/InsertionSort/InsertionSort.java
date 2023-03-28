package homework_15.Varsik_Pijoyan.SortingAlgorithms.InsertionSort;

public class InsertionSort {
    public static void main(String args[]) {
        int[] arr = {9, 0, 2, 5, 1, 6, 4, 3};
        System.out.println("Before sorting");
        beforeSorting(arr);
        insertionSort(arr);
        System.out.println("After sorting");
        printArray(arr);
    }

    public static void beforeSorting(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void insertionSort(int[] arr) {
        int size = arr.length;

        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int j = i - 1;
            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = key; // Placing key at after the element just smaller than it.
        }
    }



    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

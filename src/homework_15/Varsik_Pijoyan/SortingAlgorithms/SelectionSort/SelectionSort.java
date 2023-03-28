package homework_15.Varsik_Pijoyan.SortingAlgorithms.SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9, 14, 3, 2, 43, 11, 58, 22};
        System.out.println("Before sorting");
        beforeSorting(arr);
        selectionSort(arr);
        System.out.println("After sorting");
        printArray(arr);
    }

    public static void beforeSorting(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j; //searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

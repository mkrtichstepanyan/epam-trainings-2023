package homework_15.Varsik_Pijoyan.SortingAlgorithms.BubbleSort;

public class BubbleSort {
    public static void main(String args[]) {
        int arr[] = {2, 4, 5, 10, 1, 9, 3, 8, 7, 6};
        System.out.println("Before sorting");
        beforeSorting(arr);
        bubbleSort(arr);
        System.out.println("After sorting");
        printArray(arr);
    }

    public static void beforeSorting(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swapping elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}


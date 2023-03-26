package homework_15.Varsik_Pijoyan.SortingAlgorithms.MergeSort;

public class MergeSort {


    public static void main(String[] args) {
        int arr[] = { 11, 30, 24, 7, 31, 16, 39, 41 };
        System.out.println("Before sorting");
        beforeSorting(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("After sorting");
        printArray(arr);
    }

    public static void beforeSorting(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    //Function to merge the subarrays of arr[]
    public static void merge(int arr[], int beg, int mid, int end) {
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        //temporary Arrays
        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];

        //copying data to temp arrays
        for (i = 0; i < n1; i++) {
            LeftArray[i] = arr[beg + i];
        }
        for (j = 0; j < n2; j++) {
            RightArray[j] = arr[mid + 1 + j];
        }

        i = 0; //initial index of first sub-array
        j = 0; //initial index of second sub-array
        k = beg;  //initial index of merged sub-array

        while (i < n1 && j < n2) {
            if (LeftArray[i] <= RightArray[j]) {
                arr[k] = LeftArray[i];
                i++;
            } else {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int a[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            mergeSort(a, beg, mid);
            mergeSort(a, mid + 1, end);
            merge(a, beg, mid, end);
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}



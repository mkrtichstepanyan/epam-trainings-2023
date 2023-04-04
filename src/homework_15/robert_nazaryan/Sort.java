package homework_15.robert_nazaryan;

public class Sort {
    public static void main(String[] args) {
        int[] array = {8, 7, 9, 3, 4, 6, 1, 0, 5, 2};
        printArray(array);
        System.out.println();
        insertionSort(array);
        printArray(array);
    }
    public static void mergeSort(int[] arr){

    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i+1]){
                for (int j = i; j >= 0; j--) {
                    swap(arr,j);
                }
            }
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                swap(arr, j);
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i; j < arr.length; j++)
                if (arr[j] < arr[index]) {
                    index = j;
                }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void swap(int[] arr, int index) {
        if (arr[index] > arr[index + 1]) {
            int temp = arr[index + 1];
            arr[index + 1] = arr[index];
            arr[index] = temp;
        }
    }
}

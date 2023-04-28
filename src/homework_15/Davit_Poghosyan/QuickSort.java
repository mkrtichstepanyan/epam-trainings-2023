package homework_15.Davit_Poghosyan;

public class QuickSort {
    public static int quickSortPartition(int[] array, int low, int high) {
        int pointer = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pointer) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return (i + 1);
    }

    public static int[] quickSort(int array[], int low, int high) {
        if (low < high) {
            int p = quickSortPartition(array, low, high);
            quickSort(array, low, p - 1);
            quickSort(array, p + 1, high);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {4, 112, 1, 511, 2, 4, 7, 47, 54};
        quickSort(array, 0, array.length-1);
        for (int i = 0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }

    }
}


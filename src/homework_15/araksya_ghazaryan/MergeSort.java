package homework_15.araksya_ghazaryan;

public class MergeSort {
    public static void divide(int[] array, int leftArray, int rightArray) {
        if (leftArray < rightArray) {
            int mid = (leftArray + rightArray) / 2;
            divide(array, leftArray, mid);
            divide(array, mid + 1, rightArray);
            merge(array, leftArray, mid, rightArray);
        }
    }

    private static void merge(int[] array, int leftArray, int mid, int rightArray) {
        int[] temp = new int[array.length];
        for (int i = leftArray; i <= rightArray; i++) {
            temp[i] = array[i];
        }
        int i = leftArray;
        int j = mid + 1;
        int k = leftArray;
        while (i <= mid && j <= rightArray) {
            if (temp[i] <= temp[j]) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            array[k] = temp[i];
            i++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 6, 0, 5, 2, 4, 20, 5};
        divide(array, 0, array.length - 1);
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
package homework_15.Argishti_Mesropyan;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {50, 20, 90, 30, 10, 60, 70, 80, 40};
        print(insertionSort(arr));

    }

    public static int[] insertionSort(int[] insertionSort) {
        for (int i = 1; i < insertionSort.length; i++) {
            int ind = insertionSort[i];
            int j = i - 1;
            while (j >= 0 && insertionSort[j] > ind) {
                insertionSort[j + 1] = insertionSort[j];
                j--;
            }
            insertionSort[j + 1] = ind;
        }
        return insertionSort;
    }

    public static void print(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
    }
}

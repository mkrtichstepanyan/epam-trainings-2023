package homework_15.Davit_Poghosyan;

public class InsertionSort {
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int k = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > k) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = k;
        }
        return array;
    }


    public static void main(String[] args) {
int[] array = {1, 14, 51, 12, 1, 2, 32, 7, 57};
insertionSort(array);
for (int i =0; i< array.length; i++){
    System.out.print(array[i]+" ");
}
    }
}

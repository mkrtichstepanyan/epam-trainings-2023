package homework_15.Qnarik_Khachatryan;

class InsertionSort {
    public static int[] insertionSort(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                count++;
                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
            }
        }
        System.out.println("count: " + count);
        return array;
    }
}

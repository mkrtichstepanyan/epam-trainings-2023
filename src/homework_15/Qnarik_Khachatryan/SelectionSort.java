package homework_15.Qnarik_Khachatryan;


class SelectionSort {
    public static int[] selectionSort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minElIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                count++;
                if (array[j] < min) {
                    min = array[j];
                    minElIndex = j;
                }
            }
            array[minElIndex] = array[i];
            array[i] = min;
        }
        System.out.println("count: " + count);
        return array;
    }
}

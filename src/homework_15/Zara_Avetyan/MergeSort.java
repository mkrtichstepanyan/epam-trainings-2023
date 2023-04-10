package homework_15.Zara_Avetyan;

public class MergeSort {
    public static int[] sort(int[] array) {
        int len = array.length;
        if (array == null || len < 2) {
            return array;
        }
        int[] firstArray = new int[len / 2];
        int[] secondArray = new int[len - len / 2];
        for (int i = 0; i < len / 2; i++) {
            firstArray[i] = array[i];
        }
        for (int i = 0; i < len - len / 2; i++) {
            secondArray[i] = array[len / 2 + i];
        }
        sort(firstArray);
        sort(secondArray);
        merge(firstArray, secondArray, array);
        return array;
    }

    public static void merge(int[] firstArray, int[] secondArray, int[] array) {
        int index = 0;
        int firstIndex = 0;
        int secondIndex = 0;

        while (firstIndex < firstArray.length && secondIndex < secondArray.length) {
            if (firstArray[firstIndex] < secondArray[secondIndex]) {
                array[index++] = firstArray[firstIndex++];
            } else {
                array[index++] = secondArray[secondIndex++];
            }
        }
        while (firstArray.length > firstIndex) {
            array[index++] = firstArray[firstIndex++];
        }
        while (secondArray.length > secondIndex) {
            array[index++] = secondArray[secondIndex++];
        }
    }
}

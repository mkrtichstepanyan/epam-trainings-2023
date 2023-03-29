package homework_15.Ani_Kovalenko;

public class BubbleSort {
    protected int totalStepCount;
    protected int usedStepCount;

    protected int[] checkArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                sortArray(array, j);
                totalStepCount++;
            }
        }
        return array;
    }

    private void sortArray(int[] array, int j) {
        int tempValue;
        if (array[j] > array[j + 1]) {
            tempValue = array[j];
            array[j] = array[j + 1];
            array[j + 1] = tempValue;
            usedStepCount++;
        }
    }
}

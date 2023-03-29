package homework_15.Ani_Kovalenko;

public class SelectionSort {
    protected int totalStepCount;
    protected int usedStepCount;

    protected int[] checkArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                sortArray(array, i, j);
                totalStepCount++;
            }
        }
        return array;
    }

    private void sortArray(int[] array, int i, int j) {
        int tempValue;
        if (array[j] < array[i]) {
            tempValue = array[i];
            array[i] = array[j];
            array[j] = tempValue;
            usedStepCount++;
        }
    }
}

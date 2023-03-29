package homework_15.Ani_Kovalenko;

public class InsertionSort {
    protected int totalStepCount;
    protected int usedStepCount;
    private int tempValue;
    private int indexI;
    private boolean isAlreadySorted;

    protected int[] checkArray(int[] array) {
        int comparableNum;
        for (int i = 0; i < array.length; i++) {
            comparableNum = array[i];
            isAlreadySorted = false;
            for (int j = 0; j < i; j++) {
                if (!isAlreadySorted) {
                    sortArray(array, comparableNum, j, i);
                } else {
                    continue;
                }
                totalStepCount++;
            }
        }
        return array;
    }

    private void sortArray(int[] array, int comparableNum, int j, int i) {
        if (comparableNum < array[j]) {
            tempValue = array[j];
            array[j] = comparableNum;
            if (j > 0) {
                indexI = i;
                do {
                    array[indexI] = array[indexI - 1];
                    indexI--;
                } while (indexI > j + 1);
            }
            array[j + 1] = tempValue;
            usedStepCount++;
            isAlreadySorted = true;
        }
    }
}

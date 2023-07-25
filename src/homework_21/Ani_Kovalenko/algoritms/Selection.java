package homework_21.Ani_Kovalenko.algoritms;

public class Selection extends SortingAlgorithm {

    @Override
    public synchronized void customSort(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length; i++) {
            int currentMinIndex = i;
            int currentItemIndex = i;
            for (int j = i; j < arrayToSort.length; j++) {
                currentItemIndex = j;
                if (arrayToSort[currentItemIndex] < arrayToSort[currentMinIndex]) {
                    currentMinIndex = currentItemIndex;
                }
            }
            swap(arrayToSort, i, currentMinIndex, currentItemIndex);
        }
    }

    private void swap(int[] arrayToSort, int i, int currentMinIndex, int currentItemIndex) {
        int temp;
        temp = arrayToSort[i];
        arrayToSort[i] = arrayToSort[currentMinIndex];
        arrayToSort[currentMinIndex] = temp;
    }


}

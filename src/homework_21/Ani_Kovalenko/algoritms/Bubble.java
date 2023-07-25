package homework_21.Ani_Kovalenko.algoritms;

public class Bubble extends SortingAlgorithm {

    @Override
    public synchronized void customSort(int[] arrayToSort) {
        int temp;
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            for (int j = 0; j < arrayToSort.length - i - 1; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = temp;
                }
            }
        }
    }
}

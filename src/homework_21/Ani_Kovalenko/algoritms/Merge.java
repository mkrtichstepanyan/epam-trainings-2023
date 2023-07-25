package homework_21.Ani_Kovalenko.algoritms;

public class Merge extends SortingAlgorithm {
    private int leftIndexOf = 0;
    private int rightIndexOf = 0;
    private int mainIndexOf = 0;

    @Override
    public synchronized void customSort(int[] arrayToSort) {
        halveRecursively(arrayToSort);
    }

    int[] halveRecursively(int[] arrayToSort) {
        if (arrayToSort.length < 2) {
            return arrayToSort;
        }

        int midLength = arrayToSort.length / 2;
        int[] leftArray = new int[midLength];
        int[] rightArray = new int[arrayToSort.length - midLength];

        fillArrays(arrayToSort, leftArray, rightArray, midLength);

        halveRecursively(leftArray);

        halveRecursively(rightArray);

        mergeProcessing(arrayToSort, leftArray, rightArray);
        return arrayToSort;
    }

    private void fillArrays(int[] array, int[] leftArray, int[] rightArray, int midLength) {
        int indexOf = 0;
        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[i];
        }
        for (int i = midLength; i < array.length; i++) {
            rightArray[indexOf++] = array[i];
        }
    }

    private void mergeProcessing(int[] mainArray, int[] left, int[] right) {
        while (leftIndexOf < left.length && rightIndexOf < right.length) {
            compareValues(mainArray, left, right);
        }
        while (leftIndexOf < left.length) {
            insertBiggerValuesLeft(mainArray, left);
        }
        while (rightIndexOf < right.length) {
            insertBiggerValuesRight(mainArray, right);
        }
        leftIndexOf = 0;
        rightIndexOf = 0;
        mainIndexOf = 0;
    }

    private void compareValues(int[] mainArray, int[] left, int[] right) {
        if (left[leftIndexOf] <= right[rightIndexOf]) {
            mainArray[mainIndexOf] = left[leftIndexOf];
            leftIndexOf++;
        } else {
            mainArray[mainIndexOf] = right[rightIndexOf];
            rightIndexOf++;
        }
        mainIndexOf++;
    }

    private void insertBiggerValuesLeft(int[] mainArray, int[] left) {
        mainArray[mainIndexOf] = left[leftIndexOf];
        leftIndexOf++;
        mainIndexOf++;
    }

    private void insertBiggerValuesRight(int[] mainArray, int[] right) {
        mainArray[mainIndexOf] = right[rightIndexOf];
        rightIndexOf++;
        mainIndexOf++;
    }
}

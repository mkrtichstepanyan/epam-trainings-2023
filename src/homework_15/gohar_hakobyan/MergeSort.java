package homework_15.gohar_hakobyan;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arrA = {1, 24, 5, 7,};
        System.out.println(Arrays.toString(mergeSort(arrA)));

    }

    private static int[] mergeSort(int[] inputArr) {
        int inputLength = inputArr.length;
        if (inputLength < 2) {
            return inputArr;
        }
        int midIndex = inputLength / 2;
        int[] left = new int[midIndex];
        int[] right = new int[inputLength - midIndex];

        System.arraycopy(inputArr, 0, left, 0, midIndex);
        System.arraycopy(inputArr, midIndex, right, 0, inputLength - midIndex);
        return merge(inputArr, mergeSort(left), mergeSort(right));
    }

    //Merge arrays
    private static int[] merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0, j = 0, k = 0;
        while (i < rightSize && j < leftSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
        return inputArray;
    }
}

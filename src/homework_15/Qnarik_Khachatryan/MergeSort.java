package homework_15.Qnarik_Khachatryan;

import java.util.Arrays;

class MergeSort {
    //dividing array into left and right sides and calling mergeArrays for them
    public static int[] mergeSort(int[] array) {

        if (array.length == 1) {
            return array;
        }
        int midPos = (int) Math.ceil((double) array.length / 2);
        int[] leftSide = Arrays.copyOfRange(array, 0, midPos);
        int[] rightSide = Arrays.copyOfRange(array, midPos, array.length);
        leftSide = mergeSort(leftSide);
        rightSide = mergeSort(rightSide);
        return mergeArrays(leftSide, rightSide);
    }


    //sorting and merging already divided arrays
    public static int[] mergeArrays(int[] leftSide, int[] rightSide) {
        int leftSize = leftSide.length;
        int rightSize = rightSide.length;
        int[] sortedArray = new int[leftSize + rightSize];
        int sortedArrayStartIndex = 0;
        int leftPointer = 0;
        int rightPointer = 0;


        while (leftPointer < leftSize && rightPointer < rightSize) {
            if (leftSide[leftPointer] < rightSide[rightPointer]) {
                sortedArray[sortedArrayStartIndex] = leftSide[leftPointer];
                sortedArrayStartIndex++;
                leftPointer++;

            } else {
                sortedArray[sortedArrayStartIndex] = rightSide[rightPointer];
                sortedArrayStartIndex++;
                rightPointer++;
            }
        }

        if (leftPointer == leftSize) {
            while (rightPointer < rightSize) {
                sortedArray[sortedArrayStartIndex] = rightSide[rightPointer];
                sortedArrayStartIndex++;
                rightPointer++;
            }
        }

        if (rightPointer == rightSize) {
            while (leftPointer < leftSize) {
                sortedArray[sortedArrayStartIndex] = leftSide[leftPointer];
                sortedArrayStartIndex++;
                leftPointer++;
            }
        }
        return sortedArray;
    }
}

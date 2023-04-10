package homework_15.Radik_Manasyan;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {-13, 3, -14, 2, 12, 5, 9, -4, 15, -1};
        mergeSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    public static void mergeSort(int[] array) {
        int[] left;
        int[] right;

        if (array.length == 1) {
            return;
        } else {
            int[][] divideArray = divideArray(array);
            left = divideArray[0];
            right = divideArray[1];

            mergeSort(left);
            mergeSort(right);
        }

        endSortedStep(array, left, right);
    }

    private static void endSortedStep(int[] array, int[] l, int[] r) {
        int[][] ints = sortArraysElements(l, r);

        int[] left = ints[0];
        int[] right = ints[1];

        for (int j = 0; j < array.length; j++) {
            if (j < array.length / 2) {
                array[j] = left[j];

            } else if (array.length % 2 != 0 && j + 1 == array.length - array.length / 2) {
                array[j] = left[j];

            } else {
                array[j] = right[j - left.length];
            }
        }
    }

    private static int[][] sortArraysElements(int[] l, int[] r) {
        int iterCount = 0;
        int tmp = 0;

        int[] left = l;
        int[] right = r;

        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] > right[j]) {
                    iterCount++;
                } else {
                    break;
                }
            }
            for (int j = 0; j < iterCount; j++) {
                if (iterCount == left.length - 1 && left.length == right.length) {
                    if (i + j <= left.length - 1) {
                        tmp = left[i + j];
                        left[i + j] = right[j];
                        right[j] = tmp;
                    } else {
                        tmp = right[i + j - right.length];
                        right[i + j - right.length] = right[j];
                        right[j] = tmp;
                    }
                } else {
                    tmp = left[i + j];
                    left[i + j] = right[j];
                    right[j] = tmp;
                }
            }
            iterCount = 0;
        }
        int[][] sortArras = {left, right};
        return sortArras;
    }

    private static int[] getDivideArraySize(int[] array) {
        int leftSize = 0;
        int rightSize = 0;

        if (array.length % 2 != 0) {
            leftSize = array.length - array.length / 2;
            rightSize = array.length / 2;
        } else {
            leftSize = array.length / 2;
            rightSize = array.length / 2;
        }
        int[] lRSize = {leftSize, rightSize};
        return lRSize;
    }

    private static int[][] divideArray(int[] array) {
        int[] divideArraySize = getDivideArraySize(array);

        int[] left = new int[divideArraySize[0]];
        int[] right = new int[divideArraySize[1]];

        int[][] result = {left, right};
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                left[i] = array[i];
            } else if (array.length % 2 != 0 && i + 1 == array.length - array.length / 2) {
                left[i] = array[i];
            } else {
                right[i - left.length] = array[i];
            }
        }
        return result;
    }
}

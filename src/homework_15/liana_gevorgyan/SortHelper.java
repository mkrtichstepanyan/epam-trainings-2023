package homework_15.liana_gevorgyan;

import java.util.Arrays;

public class SortHelper {

    public static int[] bubbleSort(int[] arrayToSort) {
//        printArray(arrayToSort);
        int temp;
        for (int i = 1 ; i < arrayToSort.length; i++) {
            for (int j = 0; j < arrayToSort.length-i; j++) {
                if (arrayToSort[j] > arrayToSort[j+1]) {
                    temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j+1];
                    arrayToSort[j+1] = temp;
                }
//                printArray(arrayToSort);
            }
        }

        return arrayToSort;
    }

    public static int[] selectionSort(int[] arrayToSort) {

        int minIndex;
        int temp;
        for (int i=0; i< arrayToSort.length; i++) {
            minIndex = i;
            for (int j=i+1; j<arrayToSort.length; j++) {
                if (arrayToSort[j]<arrayToSort[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                temp = arrayToSort[i];
                arrayToSort[i] = arrayToSort[minIndex];
                arrayToSort[minIndex] = temp;
            }
        }

        return arrayToSort;
    }

    public static int[] insertionSort(int[] arrayToSort) {
        int temp;
        int j;
        for (int i = 1; i < arrayToSort.length; i++) {
            j = i;
//            printArray(arrayToSort);
            while (j > 0 && arrayToSort[j - 1] > arrayToSort[j]) {
                temp = arrayToSort[j - 1];
                arrayToSort[j - 1] = arrayToSort[j];
                arrayToSort[j] = temp;
//                printArray(arrayToSort);
                j--;
            }

        }

        return arrayToSort;
    }

    public static int[] mergeSort(int[] arrayToSort) {
        if (arrayToSort.length == 1) {
            return arrayToSort;
        }

        int[] first = Arrays.copyOfRange(arrayToSort, 0, arrayToSort.length/2);
        int[] second = Arrays.copyOfRange(arrayToSort, arrayToSort.length/2, arrayToSort.length);

        first = mergeSort(first);
        second = mergeSort(second);

        return merge(first,second);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];
        int firstIndex = 0;
        int secondIndex = 0;
        int mergeIndex = 0;
        while (firstIndex < first.length && secondIndex < second.length) {
            if ( first[firstIndex]< second[secondIndex]) {
                merged[mergeIndex] = first[firstIndex];
                firstIndex++;
            } else {
                merged[mergeIndex] = second[secondIndex];
                secondIndex++;
            }
            mergeIndex++;
        }

        while (firstIndex < first.length) {
            merged[mergeIndex] = first[firstIndex];
            firstIndex++;
            mergeIndex++;
        }

        while (secondIndex < second.length) {
            merged[mergeIndex] = second[secondIndex];
            secondIndex++;
            mergeIndex++;
        }

        return merged;
    }

    private static void printArray(int[] arrayToPrint) {
        for (int element : arrayToPrint) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

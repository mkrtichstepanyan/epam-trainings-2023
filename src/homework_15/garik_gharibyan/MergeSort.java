package homework_15.garik_gharibyan;

import java.util.Arrays;

public class MergeSort {
    private MergeSort(){
    }


    static int[] sort(int[] array) {
        MergeSort margeSort = new MergeSort();

        DividedArray dividedArray = margeSort.divide(array);
        if (dividedArray.getSize() <= 4) {
            return margeSort.sortAndMargArrays(dividedArray.first, dividedArray.second);
        } else {
            int[] sorted1 = sort(dividedArray.first);  // 7,3,5,8,0,4,0,0,0
            int[] sorted2 = sort(dividedArray.second); // 0,-78,45,-8,4,4,4,4

            return margeSort.toMerge(sorted1, sorted2);
        }

    }

    private DividedArray divide(int[] array) {
        int[] first;
        int[] second;

        if (array.length < 2) {
            first = array;
            second = new int[0];
            return new DividedArray(first, second);
        }

        if (array.length % 2 == 0) {
            first = Arrays.copyOfRange(array, 0, array.length / 2);
            second = Arrays.copyOfRange(array, array.length / 2, array.length);

        } else {
            first = Arrays.copyOfRange(array, 0, array.length / 2 + 1);
            second = Arrays.copyOfRange(array, array.length / 2 + 1, array.length);

        }
        return new DividedArray(first, second);

    }

    private int[] sortAndMargArrays(int[] first, int[] second) {

        int[] sortedFirst = toSort(first);
        int[] sortedSecond = toSort(second);
        int[] sortedAndMergedArray = toMerge(sortedFirst, sortedSecond);

        return sortedAndMergedArray;
    }

    private int[] toSort(int[] array) {
        int[] sortedArray = new int[0];
        if (array.length == 1) {
            sortedArray = array;
        }
        if (array.length == 2) {
            if (array[0] > array[1]) {
                sortedArray = new int[]{array[1], array[0]};
            } else {
                sortedArray = array;
            }
        }
        return sortedArray;
    }

    private int[] toMerge(int[] firstArray, int[] secondArray) {

        int size = firstArray.length + secondArray.length;
        int[] mergedArray = new int[size];
        int indexFirst = 0;
        int indexSecond = 0;
        int indexMerged = 0;

        while (true) {
            Integer first = getOrNull(firstArray, indexFirst);
            Integer second = getOrNull(secondArray, indexSecond);

            if (first == null && second == null) {
                break;
            }
            if (first == null) {
                mergedArray[indexMerged] = second;
                indexMerged++;
                indexSecond++;
            } else if (second == null) {
                mergedArray[indexMerged] = first;
                indexMerged++;
                indexFirst++;
            } else {
                if (first <= second) {
                    mergedArray[indexMerged] = first;
                    indexFirst++;
                } else {
                    mergedArray[indexMerged] = second;
                    indexSecond++;
                }
                indexMerged++;
            }
        }


        return mergedArray;

    }

    private Integer getOrNull(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            return null;
        }
        return array[index];
    }
}

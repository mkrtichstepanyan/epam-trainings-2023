package homework_21.gohar_hakobyan.sorter;

import java.util.ArrayList;
import java.util.List;

public class MergeSorter extends AbstractSorter {
    @Override
    public void sort(List<Integer> list) {
        mergeSort(list);

    }

    private static List<Integer> mergeSort(List<Integer> inputList) {
        int inputLength = inputList.size();
        if (inputLength < 2) {
            return inputList;
        }
        int midIndex = inputLength / 2;
        List<Integer> left = new ArrayList<>(midIndex);
        List<Integer> right = new ArrayList<>(inputLength - midIndex);

        for (int i = 0; i < midIndex; i++) {
            left.add(inputList.get(i));
        }

        for (int i = midIndex; i < inputLength; i++) {
            right.add(inputList.get(i));
        }

        return merge(inputList, mergeSort(left), mergeSort(right));
    }

    //Merge arrays
    private static List<Integer> merge(List<Integer> inputList, List<Integer> leftHalf, List<Integer> rightHalf) {
        int leftSize = leftHalf.size();
        int rightSize = rightHalf.size();
        int i = 0, j = 0, k = 0;
        while (i < rightSize && j < leftSize) {
            if (leftHalf.get(i) <= rightHalf.get(j)) {
                inputList.set(k, leftHalf.get(i));
                i++;
            } else {
                inputList.set(k, rightHalf.get(j));
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            inputList.set(k, leftHalf.get(i));
            i++;
            k++;
        }
        while (j < rightSize) {
            inputList.set(k, rightHalf.get(j));
            j++;
            k++;
        }
        return inputList;
    }


    @Override
    long getExecutionTime(List<Integer> list) {
        long start = System.nanoTime();
        //sorting logic
        sort(list);
        long end = System.nanoTime();
        return end - start;
    }
}

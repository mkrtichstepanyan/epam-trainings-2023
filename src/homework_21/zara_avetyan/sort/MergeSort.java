package homework_21.zara_avetyan.sort;

import homework_21.zara_avetyan.SortingAlgorithm;

import java.util.ArrayList;

public class MergeSort extends SortingAlgorithm {

    public MergeSort(ArrayList<Integer> list, int attempt) {
        super(list, attempt);
    }

    public ArrayList<Integer> sort(ArrayList<Integer> array) {
        int len = array.size();
        if (len < 2) {
            return array;
        }
        ArrayList<Integer> firstArray = new ArrayList<>(len / 2);
        ArrayList<Integer> secondArray = new ArrayList<>(len - len / 2);
        for (int i = 0; i < len / 2; i++) {
            firstArray.add(array.get(i));
        }
        for (int i = 0; i < len - len / 2; i++) {
            secondArray.add(array.get(len / 2 + i));
        }
        merge(sort(firstArray), sort(secondArray), array);
        return array;
    }

    public static void merge(ArrayList<Integer> firstArray, ArrayList<Integer> secondArray, ArrayList<Integer> array) {
        int index = 0;
        int firstIndex = 0;
        int secondIndex = 0;

        while (firstIndex < firstArray.size() && secondIndex < secondArray.size()) {
            if (firstArray.get(firstIndex) < secondArray.get(secondIndex)) {
                array.set(index++, firstArray.get(firstIndex++));
            } else {
                array.set(index++, secondArray.get(secondIndex++));
            }
        }
        while (firstArray.size() > firstIndex) {
            array.set(index++, firstArray.get(firstIndex++));
        }
        while (secondArray.size() > secondIndex) {
            array.set(index++, secondArray.get(secondIndex++));
        }
    }
}

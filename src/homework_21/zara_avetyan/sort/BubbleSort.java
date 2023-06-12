package homework_21.zara_avetyan.sort;

import homework_21.zara_avetyan.SortingAlgorithm;

import java.util.ArrayList;

public class BubbleSort extends SortingAlgorithm {

    public BubbleSort(ArrayList<Integer> list, int attempt) {
        super(list, attempt);
    }

    public ArrayList<Integer> sort(ArrayList<Integer> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = 0; j < array.size() - i - 1; j++) {
                swap(array, j);
            }
        }
        return array;
    }

    public void swap(ArrayList<Integer> array, int j) {
        int temp;
        if (array.get(j) > array.get(j + 1)) {
            temp = array.get(j + 1);
            array.set(j + 1, array.get(j));
            array.set(j, temp);
        }
    }
}

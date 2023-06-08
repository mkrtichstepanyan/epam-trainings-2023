package homework_21.zara_avetyan.sort;

import homework_21.zara_avetyan.SortingAlgorithm;

import java.util.ArrayList;

public class SelectionSort extends SortingAlgorithm {

    public SelectionSort(ArrayList<Integer> list, int attempt) {
        super(list, attempt);
    }


    public ArrayList<Integer> sort(ArrayList<Integer> array) {
        int min, temp, size = array.size();
        for (int i = 0; i < size - 1; i++) {
            min = i;
            for (int j = i + 1; j < size; j++) {
                if (array.get(min) > array.get(j)) {
                    min = j;
                }
            }
            temp = array.get(i);
            array.set(i, array.get(min));
            array.set(min, temp);
        }
        return array;
    }
}

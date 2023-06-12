package homework_21.zara_avetyan.sort;

import homework_21.zara_avetyan.SortingAlgorithm;

import java.util.ArrayList;

public class InsertionSort extends SortingAlgorithm {

    public InsertionSort(ArrayList<Integer> list, int attempt) {
        super(list, attempt);
    }

    public ArrayList<Integer> sort(ArrayList<Integer> array) {
        for (int i = 1; i < array.size(); i++) {
            int temp = array.get(i);
            int j = i;
            while (j - 1 >= 0 && array.get(j - 1) > temp) {
                array.set(j, array.get(j - 1));
                j--;
            }
            array.set(j, temp);
        }
        return array;
    }
}

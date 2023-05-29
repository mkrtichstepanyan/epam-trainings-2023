package homework_21.hovhannes_gspeyan.sortingApi;

import java.util.List;

public class QuickSort implements SortAndExecute {

    @Override
   public void sortList(List<Integer> list) {
        quickSort(list, 0, list.size() - 1);
    }

    public void quickSort(List<Integer> array, int start, int end) {
        if (start < end) {
            int pivot = partition(array, start, end);
            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
    }

    private int partition(List<Integer> array, int start, int end) {
        int pivot = array.get(end);
        int i = (start - 1);

        for (int j = start; j < end; j++) {
            if (array.get(j) <= pivot) {
                i++;

                int swapTmp = array.get(i);
                array.set(i, array.get(j));
                array.set(j, swapTmp);
            }
        }

        int swapTmp = array.get(i + 1);
        array.set(i + 1, array.get(end));
        array.set(end, swapTmp);

        return i + 1;
    }
}

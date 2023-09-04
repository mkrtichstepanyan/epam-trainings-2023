package homework_21.gohar_hakobyan.sorter;

import java.util.List;

public class QuickSorter extends AbstractSorter {
    @Override
    void sort(List<Integer> list) {
        quickSort(list, 0, list.size() - 1);
    }

    public void quickSort(List<Integer> arr, int begin, int end) {
        if (begin < end) {
            int pivot = partition(arr, begin, end);
            quickSort(arr, begin, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    private int partition(List<Integer> arr, int begin, int end) {
        int pivot = arr.get(end);
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr.get(j) <= pivot) {
                i++;

                int swapTemp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, swapTemp);
            }
        }

        int swapTemp = arr.get(i + 1);
        arr.set(i + 1, arr.get(end));
        arr.set(end, swapTemp);

        return i + 1;
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

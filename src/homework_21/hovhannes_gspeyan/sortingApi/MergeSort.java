package homework_21.hovhannes_gspeyan.sortingApi;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements SortAndExecute {

    @Override
    public void sortList(List<Integer> list){
        mergeSortHelper(list, 0, list.size() - 1);
    }

    private static void mergeSortHelper(List<Integer> list, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSortHelper(list, left, mid);
            mergeSortHelper(list, mid + 1, right);
            merge(list, left, mid, right);
        }
    }

    private static void merge(List<Integer> list, int left, int mid, int right) {
        int leftListSize = mid - left + 1;
        int rightListSize = right - mid;

        List<Integer> leftList = new ArrayList<>(leftListSize);
        List<Integer> rightList = new ArrayList<>(rightListSize);

        for (int i = 0; i < leftListSize; i++) {
            leftList.add(list.get(left + i));
        }
        for (int j = 0; j < rightListSize; j++) {
            rightList.add(list.get(mid + 1 + j));
        }

        int i = 0, j = 0, x = left;
        while (i < leftListSize && j < rightListSize) {
            if (leftList.get(i) <= rightList.get(j)) {
                list.set(x, leftList.get(i));
                i++;
            } else {
                list.set(x, rightList.get(j));
                j++;
            }
            x++;
        }

        while (i < leftListSize) {
            list.set(x, leftList.get(i));
            i++;
            x++;
        }

        while (j < rightListSize) {
            list.set(x, rightList.get(j));
            j++;
            x++;
        }
    }
}

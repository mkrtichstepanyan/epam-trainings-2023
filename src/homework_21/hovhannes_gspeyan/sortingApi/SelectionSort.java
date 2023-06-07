package homework_21.hovhannes_gspeyan.sortingApi;

import java.util.List;

public class SelectionSort implements SortAndExecute {

    @Override
    public void sortList(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minimumIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) <= list.get(minimumIndex)) {
                    minimumIndex = j;
                }
            }
            int tmp = list.get(i);
            list.set(i, list.get(minimumIndex));
            list.set(minimumIndex, tmp);
        }
    }
}

package homework_21.hovhannes_gspeyan.sortingApi;

import java.util.List;

public class BubbleSort implements SortAndExecute {

    @Override
    public void sortList(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size() - i - 1; j++) {
                if (list.get(i) > list.get(j + 1)) {
                    int tmp;
                    tmp = list.get(i);
                    list.set(i, list.get(j + 1));
                    list.set(j + 1, tmp);
                }
            }
        }
    }
}

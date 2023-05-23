package homework_21.gohar_hakobyan.sorter;

import java.util.List;

public class SelectionSorter extends AbstractSorter {

    @Override
    void sort(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) <= list.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
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

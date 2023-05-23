package homework_21.gohar_hakobyan.sorter;

import java.util.List;

public class BubbleSorter extends AbstractSorter {


    @Override
    public void sort(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size() - 1 - i; j++) {
                if (list.get(i) > list.get(j + 1)) {
                    int result;
                    result = list.get(i);
                    list.set(i, list.get(j + 1));
                    list.set(j + 1, result);
                }
            }
        }
    }

    public long getExecutionTime(List<Integer> list) {
        long start = System.nanoTime();
        //sorting logic
        sort(list);
        long end = System.nanoTime();
        return end - start;
    }
}

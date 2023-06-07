package homework_21.hovhannes_gspeyan.sortingApi;

import java.util.List;
public interface SortAndExecute {
    void sortList(List<Integer> list);
    default long getTimeSpeed(List<Integer> list){
        long start = System.nanoTime();
        sortList(list);
        long end = System.nanoTime();
        return end - start;
    }
}

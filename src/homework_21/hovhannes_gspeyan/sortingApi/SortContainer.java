package homework_21.hovhannes_gspeyan.sortingApi;

import java.util.HashMap;
import java.util.Map;

public class SortContainer {
    private static final Map<Type, SortAndExecute> sorterMap = new HashMap<>();

    static {
        sorterMap.put(Type.BUBBLE, new BubbleSort());
        sorterMap.put(Type.SELECTION, new SelectionSort());
        sorterMap.put(Type.QUICK, new QuickSort());
        sorterMap.put(Type.MERGE, new MergeSort());
    }
    public static SortAndExecute getSorter(Type type) {
        return sorterMap.get(type);
    }
}

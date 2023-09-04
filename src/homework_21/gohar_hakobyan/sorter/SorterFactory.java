package homework_21.gohar_hakobyan.sorter;

import java.util.HashMap;
import java.util.Map;

public class SorterFactory {
    private static Map<SortingTypes, AbstractSorter> sorters = new HashMap<>();

    static {
        sorters.put(SortingTypes.BUBBLE, new BubbleSorter());
        sorters.put(SortingTypes.SELECTION, new SelectionSorter());
        sorters.put(SortingTypes.QUICK, new QuickSorter());
        sorters.put(SortingTypes.MERGE, new MergeSorter());
    }


    public static AbstractSorter getSorter(SortingTypes type) {
        return sorters.get(type);
    }
}

package homework_21.gohar_hakobyan.sorter;

import java.util.List;

public abstract class AbstractSorter {

    abstract void sort(List<Integer> list);

    abstract long getExecutionTime(List<Integer> list);


}

package homework_21.garik_gharibyan.sort;

import java.util.ArrayList;

public class InsertionRunnable extends AbstractAttemptsRunnable {

    public InsertionRunnable(ArrayList<Integer> list, int attemptsCount) {
        super(list, attemptsCount, "Insertion");
    }

    @Override
    void executeSort(ArrayList<Integer> list) {
        Sort.insertion(list);
    }


}

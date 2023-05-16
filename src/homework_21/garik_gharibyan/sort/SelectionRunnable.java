package homework_21.garik_gharibyan.sort;


import java.util.ArrayList;

public class SelectionRunnable extends AbstractAttemptsRunnable {

    public SelectionRunnable(ArrayList<Integer> list, int attemptsCount) {
        super(list, attemptsCount, Algorithm.SELECTION);
    }

    @Override
    void executeSort(ArrayList<Integer> list) {
        Sort.selection(list);
    }

}

package homework_21.garik_gharibyan.sort;


import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public class SelectionRunnable extends AbstractAttemptsRunnable {

    public SelectionRunnable(ArrayList<Integer> list, int attemptsCount) {
        super(list, attemptsCount, "Selection");
    }

    @Override
    void executeSort(ArrayList<Integer> list) {
        Sort.selection(list);
    }

}

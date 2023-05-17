package homework_21.garik_gharibyan.sort;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public class BubbleRunnable extends AbstractAttemptsRunnable {

    public BubbleRunnable(ArrayList<Integer> list, int attemptsCount) {
        super(list, attemptsCount,"Bubble");
    }

    @Override
    void executeSort(ArrayList<Integer> list) {
        Sort.bubble(list);
    }
}

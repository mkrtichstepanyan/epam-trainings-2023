package homework_21.garik_gharibyan.sort;

import java.util.ArrayList;

public class BubbleRunnable extends AbstractAttemptsRunnable {

    public BubbleRunnable(ArrayList<Integer> list, int attemptsCount) {
        super(list, attemptsCount, Algorithm.BUBBLE);
    }

    @Override
    void executeSort(ArrayList<Integer> list) {
        Sort.bubble(list);
    }
}

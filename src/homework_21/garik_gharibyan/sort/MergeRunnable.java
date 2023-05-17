package homework_21.garik_gharibyan.sort;

import homework_15.garik_gharibyan.MergeSort;

import java.util.ArrayList;

public class MergeRunnable extends AbstractAttemptsRunnable {
    public MergeRunnable(ArrayList<Integer> list, int attemptsCount) {
        super(list, attemptsCount, "Merge");
    }

    @Override
    void executeSort(ArrayList<Integer> list) {
        int[] ints = list.stream().mapToInt(i -> i).toArray();
        MergeSort.sort(ints);
    }

}

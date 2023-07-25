package homework_21.Ani_Kovalenko;

import homework_21.Ani_Kovalenko.algoritms.AlgorithmTypes;

import java.util.Arrays;

public class ThreadTask extends Thread {
    int[] arrayToSort;
    int[] mainShape;
    long[] results;

    ThreadTask(int[] arrayToSort, long[] results) {
        this.results = results;
        this.arrayToSort = arrayToSort;
        mainShape = Arrays.copyOf(arrayToSort, arrayToSort.length);
    }

    @Override
    public void run() {
        for (int i = 0; i < AlgorithmTypes.values().length; i++) {
            Sorter sorter = new Sorter();
            results[i] = sorter.sort(arrayToSort, i);
            arrayToSort = Arrays.copyOf(mainShape, mainShape.length);
        }
    }
}

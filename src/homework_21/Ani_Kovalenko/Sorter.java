package homework_21.Ani_Kovalenko;

import homework_21.Ani_Kovalenko.algoritms.*;

public class Sorter {

    long sort(int[] arrayToSort, int i) {
        long start = System.nanoTime();
        SortingAlgorithm currentAlgorithm = switch (i) {
            case 0 -> new Bubble();
            case 1 -> new Selection();
            case 2 -> new Merge();
            default -> new Quick();
        };
        currentAlgorithm.customSort(arrayToSort);
        long end = System.nanoTime();
        return end - start;
    }
}

package homework_21.Radik_Manasyan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class SortingVelocitySpeed implements Runnable {
    private List<Long> timeList = new ArrayList<>();
    private int attempts;
    private int[] listIntegers;


    public SortingVelocitySpeed(int[] array, int attempts) {
        this.listIntegers = array;
        this.attempts = attempts;
    }

    @Override
    public void run() {
        for (int i = 0; i < attempts; i++) {
            long startTime = System.nanoTime();
            sort(listIntegers);
            long endTime = System.nanoTime();
            timeList.add(endTime - startTime);
        }
    }

    public abstract void sort(int[] array);

    public void getSortingTimeResult(String sortedMethodName) {
        for (int i = 0; i < timeList.size(); i++) {
            if (i == 0) {
                System.out.printf("%-14s |", sortedMethodName);
            }
            System.out.printf("%-8s |", timeList.get(i));
        }
        System.out.printf("%-4s | %-4s| %.2f| %-4s", getMin(listIntegers), getMax(listIntegers), getAVG(listIntegers), getMedium(listIntegers));
        System.out.println();
    }

    private int getMax(int[] array) {
        return Arrays.stream(array).max().getAsInt();
    }

    private int getMin(int[] array) {
        return Arrays.stream(array).min().getAsInt();
    }

    private double getAVG(int[] array) {
        return Arrays.stream(array).average().getAsDouble();
    }

    private int getMedium(int[] array) {
        int[] sortedArray = Arrays.stream(array).sorted().toArray();
        int mediumIndex = sortedArray.length / 2;

        return sortedArray[mediumIndex];
    }
}

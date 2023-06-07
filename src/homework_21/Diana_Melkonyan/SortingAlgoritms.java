package homework_21.Diana_Melkonyan;

import java.util.*;

public abstract class SortingAlgoritms implements Runnable {
    private List<Long> list = new ArrayList<>();
    private int attempts;
    private int[] listInt;


    public SortingAlgoritms(int[] array, int attempts) {
        this.attempts = attempts;
        this.listInt = array;

    }

    public abstract void sort(int[] array);

    @Override
    public void run() {
        for (int i = 0; i < attempts; i++) {
            long start = System.nanoTime();
            sort(listInt);
            long end = System.nanoTime();
            list.add(end - start);
        }
    }

    public static long getMax(List<Long> list) {
        Optional<Long> max = list.stream().max(Long::compareTo);
        if (max.isPresent()) {
            return max.get();
        } else {
            throw new RuntimeException();
        }
    }

    public static long getMin(List<Long> list) {
        Optional<Long> min = list.stream().min(Long::compareTo);
        if (min.isPresent()) {
            return min.get();
        } else {
            throw new RuntimeException();
        }
    }

    public static long getAvg(List<Long> list) {
        long sum = 0;
        for (Long l : list) {
            sum = sum + l;
        }
        return sum / list.size();

    }

    public static long getMedian(List<Long> list) {
        list.sort(null);
        int middle = list.size() / 2;
        if (list.size() % 2 == 1) {
            return list.get(middle);
        } else {
            return (long) ((list.get(middle - 1) + list.get(middle)) / 2);
        }
    }

    public void print(String sortedMethodName) {
        System.out.printf("%-14s |", sortedMethodName);
        for (int i = 0; i < list.size(); i++) {

            System.out.print((i + 1) + "| " + list.get(i) + " " + "| ");

        }
        System.out.println("Max: " + getMax(list) + "  Min: " + getMin(list) + "  Average: " + getAvg(list) + "  Median: " + getMedian(list));
    }

}



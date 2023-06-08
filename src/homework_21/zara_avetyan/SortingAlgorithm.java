package homework_21.zara_avetyan;

import java.util.ArrayList;

public abstract class SortingAlgorithm implements Runnable {

    int attempt;
    ArrayList<Integer> list;
    ArrayList<Integer> time;

    public SortingAlgorithm(ArrayList<Integer> list, int attempt) {
        this.list = list;
        this.attempt = attempt;
        this.time = new ArrayList<>(attempt);
    }

    @Override
    public void run() {
        long start, end;
        for (int i = 0; i < attempt; i++) {
            start = System.nanoTime();
            sort(list);
            end = System.nanoTime();
            time.add((int) (end - start));
        }

    }

    public abstract ArrayList<Integer> sort(ArrayList<Integer> array);

    public void print(String name) {
        System.out.print(String.format("%-11s|", name));
        for (int i = 0; i < attempt; i++) {
            System.out.print(String.format("%-9d|", time.get(i)));
        }

        System.out.print(String.format("%-9d|", getMin()));
        System.out.print(String.format("%-9d|", getMax()));
        System.out.print(String.format("%-9d|", getAverage()));
        System.out.print(String.format("%-9d|", getMedian()));
        System.out.println();

    }

    public long getMin() {
        long min = time.get(0);
        for (int i = 1; i < time.size(); i++) {
            if (time.get(i) < min) min = time.get(i);
        }
        return min;
    }

    public long getMax() {
        long max = time.get(0);
        for (int i = 1; i < time.size(); i++) {
            if (time.get(i) > max) max = time.get(i);
        }
        return max;
    }

    public long getAverage() {
        long sum = 0;
        for (long i : time) {
            sum += i;
        }
        return sum / time.size();
    }

    public long getMedian() {
        sort(time);
        if (time.size() % 2 == 1) {
            return time.get(time.size() / 2);
        }
        return (time.get(time.size() / 2) + time.get(time.size() / 2 - 1)) / 2;
    }
}

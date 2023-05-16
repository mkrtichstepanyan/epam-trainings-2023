package homework_21.garik_gharibyan.sort;

import homework_21.garik_gharibyan.MyMath;

import java.util.ArrayList;

public abstract class AbstractAttemptsRunnable implements Runnable {

    private final ArrayList<Integer> list;
    private final ArrayList<Long> attemptsTime;
    private final int attemptsCount;
    private final Algorithm algorithm;
    private long time;

    public AbstractAttemptsRunnable(ArrayList<Integer> list, int attemptsCount, Algorithm algorithm) {
        this.attemptsCount = attemptsCount;
        this.algorithm = algorithm;
        this.list = list;
        attemptsTime = new ArrayList<>(attemptsCount);
    }

    @Override
    public void run() {
        for (int i = 0; i < attemptsCount; i++) {
            long startTime = System.nanoTime();
            executeSort(list);
            long endTime = System.nanoTime();
            time = endTime - startTime;
            attemptsTime.add(time);
        }
    }

    abstract void executeSort(ArrayList<Integer> list);

    public long getTime() {
        return time;
    }

    private long getMax() {
        return MyMath.getMax(attemptsTime);
    }

    private long getMin() {
        return MyMath.getMin(attemptsTime);
    }

    private long getAvg() {
        return MyMath.getAvg(attemptsTime);
    }

    public void printInfo() {
        System.out.print(algorithm.name() + ": ");
        for (int i = 0; i < attemptsTime.size(); i++) {
            System.out.print((i + 1) + ". " + attemptsTime.get(i) + ", ");
        }
        System.out.println("Max: " + getMax() + ", Min: " + getMin() + ", Average: " + getAvg());
    }
}

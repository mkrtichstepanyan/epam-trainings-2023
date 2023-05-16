package classwork.threads.readwritelockex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {

    private double volInteger = 0;


    public void increment() {
        volInteger++;
    }

    public void decrement() {
        volInteger--;
    }

    public double getCount() {
        return volInteger;
    }
}

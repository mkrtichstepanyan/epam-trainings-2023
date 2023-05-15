package classwork.threads.counter;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    // assignment operation atomic
    // 32 bit

    // optional

    // happens-before
    private volatile double volInteger = 0;

//    private AtomicInteger count = new AtomicInteger();

    public void increment() {
        volInteger++;
    }

    public void decrement() {
        volInteger--;
//        count.decrementAndGet();
    }

    public double getCount() {
        return volInteger;
    }
}

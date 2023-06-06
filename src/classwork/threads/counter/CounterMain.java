package classwork.threads.counter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterMain {
    public static void main(String[] args) throws InterruptedException {

        Lock lock1 = new ReentrantLock();

        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                lock1.lock();
                counter.increment();
                lock1.unlock();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                lock1.lock();
                counter.decrement();
                lock1.unlock();
            }
        });

        t1.start();
        t2.start();


        t1.join();
        t2.join();

        System.out.println(counter.getCount());

    }
}

class Incrementer implements Runnable {

    private final Counter counter;

    Incrementer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            counter.increment();
        }
    }
}

class Decrementer implements Runnable {

    private final Counter counter;

    Decrementer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            counter.decrement();
        }
    }
}

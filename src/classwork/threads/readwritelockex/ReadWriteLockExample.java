package classwork.threads.readwritelockex;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
//        Lock lock = new ReentrantLock();

        ReadWriteLock lock = new ReentrantReadWriteLock();
        Thread t1 = new Thread(() -> {
            System.out.println("Entering thread 1");
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                lock.writeLock().lock();
                counter.increment();
                System.out.println("Incrementing");
                lock.writeLock().unlock();
            }
            System.out.println("Finishing thread 1");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Entering thread 2");
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
                lock.readLock().lock();
                System.out.println(counter.getCount());
                lock.readLock().unlock();
            }

            System.out.println("Finishing thread 2");
        });

        t1.start();
        t2.start();


        t1.join();
        t2.join();

        System.out.println(counter.getCount());

    }
}

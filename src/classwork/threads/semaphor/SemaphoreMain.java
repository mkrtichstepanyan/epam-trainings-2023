package classwork.threads.semaphor;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SemaphoreMain {

    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(2);

        Lock lock = new ReentrantLock();

        semaphore.acquire();
        // the amount of threads specified in constructor
        semaphore.release();

        lock.lock();

        lock.unlock();
    }
}

class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(10);

        latch.await();

        latch.countDown();

    }
}

class CyclicBarierDemo {
    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, () -> System.out.println("Barrier reached"));

        new Thread(new MyThread(cyclicBarrier)).start();
        new Thread(new MyThread(cyclicBarrier)).start();
        new Thread(new MyThread(cyclicBarrier)).start();

        new Thread(new MyThread(cyclicBarrier)).start();
        new Thread(new MyThread(cyclicBarrier)).start();
        new Thread(new MyThread(cyclicBarrier)).start();

        new Thread(new MyThread(cyclicBarrier)).start();
    }
}

class ExchangerDemo {

    public static void main(String[] args) throws InterruptedException {
        Exchanger<String> exchanger = new Exchanger<>();

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(1000);
                    String fromProducer = exchanger.exchange("BBB" + i);
                    System.out.println("From producer " + fromProducer);

                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(1000);
                    String fromConsumer = exchanger.exchange("AAA" + i);
                    System.out.println("From consumer " + fromConsumer);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        consumer.start();
        producer.start();

        consumer.join();
        producer.join();
    }
}

class MyThread implements Runnable {

    CyclicBarrier cyclicBarrier;

    MyThread(CyclicBarrier barrier) {
        cyclicBarrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println("A");
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }

    }
}

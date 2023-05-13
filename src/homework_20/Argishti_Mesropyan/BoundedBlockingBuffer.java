package homework_20.Argishti_Mesropyan;

import java.util.concurrent.ArrayBlockingQueue;

public class BoundedBlockingBuffer<T> implements Runnable {

    private final ArrayBlockingQueue<T> buffer;

    public BoundedBlockingBuffer(int size) {
        buffer = new ArrayBlockingQueue<>(size);
    }

    public synchronized void put(T value) throws InterruptedException {
        while (buffer.remainingCapacity() == 0) {
            wait();
        }
        buffer.put(value);
        notifyAll();
    }

    public synchronized T take() throws InterruptedException {
        while (buffer.size() == 0) {
            wait();
        }
        T value = buffer.take();
        notifyAll();

        return value;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                put((T) Integer.valueOf(i));
                System.out.println(Thread.currentThread().getName() + " put: " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

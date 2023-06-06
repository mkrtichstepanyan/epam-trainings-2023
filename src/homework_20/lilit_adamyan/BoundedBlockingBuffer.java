package homework_20.lilit_adamyan;

import java.util.LinkedList;
import java.util.Queue;

public class BoundedBlockingBuffer<T> {
    private Queue<T> buffer;
    private int maxSize;

    public BoundedBlockingBuffer(int maxSize) {
        this.buffer = new LinkedList<>();
        this.maxSize = maxSize;
    }

    public synchronized void put(T value) throws InterruptedException {
        while (buffer.size() == maxSize) {
            wait();
        }
        buffer.offer(value);
        notifyAll();
    }

    public synchronized T get() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait();
        }
        T value = buffer.poll();
        notifyAll();
        return value;
    }

}
package homework_20.Eduard_Eghiazaryan;

import java.util.LinkedList;
import java.util.Queue;

public class BoundedBlockingBuffer<T> {
    private final int capacity;
    private final Queue<T> buffer = new LinkedList<>();

    public BoundedBlockingBuffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized T take() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait();
        }
        T item = buffer.remove();
        System.out.println("Value taken: " + item);
        notifyAll();
        return item;
    }

    public synchronized void put(T item) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait();
        }
        buffer.add(item);
        System.out.println("Value put: " + item);
        notifyAll();
    }
}

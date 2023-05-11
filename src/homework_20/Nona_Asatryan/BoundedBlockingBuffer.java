package homework_20.Nona_Asatryan;

public class BoundedBlockingBuffer<T> {
    private int capacity;
    private T data;
    private boolean hasData;

    public BoundedBlockingBuffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void put(T data) throws InterruptedException {
        while (hasData) {
            wait();
        }
        this.data = data;
        hasData = true;
        notifyAll();
    }

    public synchronized T take() throws InterruptedException {
        while (!hasData) {
            wait();
        }
        T result = data;
        hasData = false;
        notifyAll();
        return result;
    }
}


package homework_20.TatevKocharyan;


public class Producer<T> implements Runnable {
    T value;
    BoundedBlockingBuffer<T> boundedBlockingBuffer;
    Thread t;

    public Producer(BoundedBlockingBuffer<T> boundedBlockingBuffer, T value) {
        this.value = value;
        this.boundedBlockingBuffer = boundedBlockingBuffer;
        this.t = new Thread(this, "Producer");
    }

    @Override

    public void run() {
        boundedBlockingBuffer.put(value);
    }
}
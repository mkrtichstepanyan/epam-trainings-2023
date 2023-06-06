package homework_20.anna_manukyan;

public class Producer<T> implements Runnable {
    private final BoundedBlockingBuffer buffer;

    public Producer(BoundedBlockingBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int data = 0;
        for (int i = 0; i < 100000; i++) {
            buffer.putValue(data++);
        }
    }
}

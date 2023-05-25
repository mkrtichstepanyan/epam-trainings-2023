package homework_20.Nona_Asatryan;

public class Producer<T> implements Runnable {
    private final BoundedBlockingBuffer buffer;

    public Producer(BoundedBlockingBuffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        int i = 0;
        while (true) {
            buffer.put(i++);
        }
    }
}

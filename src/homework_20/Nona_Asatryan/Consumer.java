package homework_20.Nona_Asatryan;

public class Consumer<T> implements Runnable {
    private final BoundedBlockingBuffer buffer;

    public Consumer(BoundedBlockingBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            buffer.take();
        }
    }
}

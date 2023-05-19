package homework_20.gohar_hakobyan;

public class Consumer<T> implements Runnable {
    private final BlockingBuffer buffer;

    public Consumer(BlockingBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            buffer.take();
        }
    }
}

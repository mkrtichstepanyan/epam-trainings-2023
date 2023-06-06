package homework_20.anna_manukyan;

public class Consumer<T> implements Runnable {
    private final BoundedBlockingBuffer buffer;

    public Consumer(BoundedBlockingBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            buffer.takeValue();
        }
    }
}

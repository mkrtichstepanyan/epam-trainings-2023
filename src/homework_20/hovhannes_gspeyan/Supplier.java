package homework_20.hovhannes_gspeyan;

public class Supplier<T> implements Runnable {

    private final BoundedBlockingBuffer buffer;

    public Supplier(BoundedBlockingBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            buffer.put(i);
        }
    }
}

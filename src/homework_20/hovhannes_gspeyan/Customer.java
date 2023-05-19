package homework_20.hovhannes_gspeyan;

public class Customer<T> implements Runnable {

    private final BoundedBlockingBuffer buffer;

    public Customer(BoundedBlockingBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            buffer.getData();
        }
    }
}

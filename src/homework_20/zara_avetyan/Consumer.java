package homework_20.zara_avetyan;

public class Consumer implements Runnable {

    private BoundedBlockingBuffer buffer;

    public Consumer(BoundedBlockingBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true)
            buffer.tack();
    }
}

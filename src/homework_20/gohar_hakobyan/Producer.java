package homework_20.gohar_hakobyan;

public class Producer<T> implements Runnable {

    private final BlockingBuffer buffer;

    public Producer(BlockingBuffer buffer) {
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

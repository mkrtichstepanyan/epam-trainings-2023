package homework_20.zara_avetyan;

public class Producer implements Runnable {

    private BoundedBlockingBuffer buffer;


    public Producer(BoundedBlockingBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        Integer i = 0;
        while (true)
            buffer.put(i++);
    }
}

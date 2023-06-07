package homework_20.Eduard_Eghiazaryan;

public class Producer implements Runnable {
    private BoundedBlockingBuffer buffer;
    private int counter;

    public Producer(BoundedBlockingBuffer buffer) {
        this.buffer = buffer;
        this.counter = 1;
    }

    @Override
    public void run() {
        while (true) {
            try {
                buffer.put(counter++);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void start() {
        Thread thread = new Thread(this, "Producer");
        thread.start();
    }
}

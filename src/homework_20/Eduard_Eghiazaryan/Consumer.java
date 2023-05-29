package homework_20.Eduard_Eghiazaryan;


public class Consumer implements Runnable {
    private BoundedBlockingBuffer buffer;

    public Consumer(BoundedBlockingBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                buffer.take();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void start() {
        Thread thread = new Thread(this, "Consumer");
        thread.start();
    }
}

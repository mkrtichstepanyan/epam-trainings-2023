package homework_20.karen_mikayelyan;

public class Consumer<T> implements Runnable {
    BoundedBuffer<T> buffer;
    Thread thread;

    public Consumer(BoundedBuffer<T> buffer) {
        this.buffer = buffer;
        thread = new Thread(this, "Consumer");
    }

    public void run() {
        while (true) {
            buffer.take();
        }
    }
}

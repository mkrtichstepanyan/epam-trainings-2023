package homework_20.Roza_Petrosyan.bounded_blocker_buffer;

public class Consumer<T> implements Runnable {
    BoundedBuffer<T> buffer;
    Thread thread;

    Consumer(BoundedBuffer<T> buffer) {
        this.buffer = buffer;
        thread = new Thread(this, "Consumer");
    }

    public void run() {
        while (true) {
            buffer.take();
        }
    }
}

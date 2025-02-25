package homework_20.Roza_Petrosyan.bounded_blocker_buffer;

public class Producer<T> implements Runnable {
    BoundedBuffer<T> buffer;
    Thread thread;

    Producer(BoundedBuffer<T> buffer) {
        this.buffer = buffer;
        thread = new Thread(this, "Producer");
    }

    public void run() {
        Integer value = 0;
        while (buffer.valueSet) {
            if (buffer != null) {
                buffer.put((T) value++);
            }
        }
    }
}

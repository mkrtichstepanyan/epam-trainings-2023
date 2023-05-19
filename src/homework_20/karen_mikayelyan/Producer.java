package homework_20.karen_mikayelyan;

public class Producer<T> implements Runnable {

    BoundedBuffer<T> buffer;
    Thread thread;

    public Producer(BoundedBuffer<T> buffer) {
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

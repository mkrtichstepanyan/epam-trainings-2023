package homework_20.zara_avetyan;

public class BoundedBlockingBuffer<T> {

    private T value;
    private boolean valueSet;

    public synchronized void put(T value) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.value = value;
        System.out.println("put:" + value);
        valueSet = true;
        notifyAll();
    }

    public synchronized T tack() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("tack:" + value);
        valueSet = false;
        notifyAll();
        return value;
    }
}

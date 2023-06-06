package homework_20.gohar_hakobyan;

public class BlockingBuffer<T> {
    private boolean valueSet = false;
    private T value;


    public synchronized void put(T value) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.value = value;
        valueSet = true;
        System.out.println("Putting: " + value);
        notifyAll();
    }


    public synchronized T take() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        valueSet = false;
        notifyAll();
        System.out.println("Taking: " + value);
        return value;
    }
}

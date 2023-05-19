package homework_20.araksya_ghazaryan;

public class BoundedBlockBuffer<T> {
    T data;
    boolean valueSet = false;

    public T getData() {
        return data;
    }
    public synchronized void put(T data) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + data);
        this.data = data;
        valueSet = true;
        notify();
    }
    public synchronized T take() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()  + data);
        valueSet = false;
        notifyAll();
        return data;
    }
}
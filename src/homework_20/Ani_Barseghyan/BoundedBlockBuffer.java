package homework_20.Ani_Barseghyan;

public class BoundedBlockBuffer<T> {
    T data;
    boolean valueSet;

    public synchronized void put(T data) throws InterruptedException {
        while (valueSet) {
            wait();
        }
        this.data = data;
        valueSet = true;
        notifyAll();
        System.out.println("Put data " + data);
    }

    public synchronized T get() throws InterruptedException {
        while (!valueSet) {
            wait();
        }
        valueSet = false;
        notifyAll();
        System.out.println("Get data " + data);
        return data;
    }
}

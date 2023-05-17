package homework_20.karen_mikayelyan;

public class BoundedBuffer<T> {
    T data;
    boolean valueSet = true;

    public synchronized T take() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(data != null) {
            System.out.println("Taking: " + data);
        }
        valueSet = false;
        notifyAll();
        return data;
    }

    public synchronized void put(T data) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception caught");
            }
        }
        this.data = data;
        valueSet = true;
        System.out.println("Putting: " + data);
        notifyAll();
    }
}

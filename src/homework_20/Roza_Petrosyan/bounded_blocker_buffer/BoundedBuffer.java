package homework_20.Roza_Petrosyan.bounded_blocker_buffer;

public class BoundedBuffer<T> {
    T data;
    boolean valueSet = true;

    synchronized T take() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception caught");
            }
        }
        if(data != null) {
            System.out.println("Got: " + data);
        }
        valueSet = false;
        notifyAll();
        return data;
    }

    synchronized void put(T data) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception caught");
            }
        }
        this.data = data;
        valueSet = true;
        System.out.println("Put: " + data);
        notifyAll();
    }
}

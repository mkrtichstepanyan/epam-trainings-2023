package homework_20.Diana_Melkonyan;

public class BoundedBlockBuffer<T> {
    T data;
    boolean valueSet = false;

    public T getData() {
        return data;
    }

    public synchronized T take() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" Value Get " + data);
        valueSet = false;
        notify();
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
        System.out.println("Value put " + data);
        this.data = data;
        valueSet = true;
        notify();
    }
}


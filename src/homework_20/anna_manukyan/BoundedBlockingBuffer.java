package homework_20.anna_manukyan;

public class BoundedBlockingBuffer<T> {
    private T data;
    private boolean isValueExist = false;


    public synchronized void putValue(T value) {
        while (isValueExist) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Put value " + value);
        data = value;
        isValueExist = true;
        notifyAll();
    }

    public synchronized T takeValue() {
        while (!isValueExist) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Get value " + data);
        isValueExist = false;
        notifyAll();
        return data;
    }
}

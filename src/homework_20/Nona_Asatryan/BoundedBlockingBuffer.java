package homework_20.Nona_Asatryan;

public class BoundedBlockingBuffer<T> {
    private T data;
    private boolean hasData = false;

    public synchronized void put(T data) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Put data " + data);
        this.data = data;
        hasData = true;
        notifyAll();
    }

    public synchronized T take() {
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
        System.out.println("Get data " + data);
        hasData = false;
        notifyAll();
        return data;
    }
}


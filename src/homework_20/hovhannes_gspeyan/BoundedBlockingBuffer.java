package homework_20.hovhannes_gspeyan;

public class BoundedBlockingBuffer<T> {

    private T data;
    private boolean dataSetter = false;

    public synchronized void put(T data) {
        while (dataSetter) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.data = data;
        dataSetter = true;
        System.out.println("put " + data);
        notifyAll();
    }

    public synchronized T getData() {
        while (!dataSetter) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        dataSetter = false;
        notifyAll();
        System.out.println("get " + data);
        return data;
    }
}

package homework_20.Alina_Mkhoyan;

public class BoundedBlockingBuffer<T> {

    private  T data;
    private boolean dataSetter = false;


    public synchronized void put(T data) {
        while (dataSetter) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()  + data);
        this.data = data;
        dataSetter = true;
        notify();
    }

    public synchronized T take() {
        while (!dataSetter) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(Thread.currentThread().getName() + data);
        dataSetter = false;
        notify();
        return data;
    }
}
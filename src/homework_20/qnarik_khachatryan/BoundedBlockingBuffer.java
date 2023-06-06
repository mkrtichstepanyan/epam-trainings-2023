package homework_20.qnarik_khachatryan;

public class BoundedBlockingBuffer<T> {
    T data;


    //Put in it the value you want to transfer.
// If the buffer already contains some value, then the thread waits until someone picks it up.
    public synchronized void put(T data) {
        while (this.data != null) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }

        }
        notifyAll();
        this.data = data;
        System.out.println("Put " + data);
    }

    //Pick up the value put there. If the buffer is empty,
    // then the thread waits until someone puts a value into it.
    public synchronized T take() {
        T newData;
        while (this.data == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        notifyAll();
        newData = data;
        data = null;
        System.out.println("Get " + newData);
        return data;
    }
}

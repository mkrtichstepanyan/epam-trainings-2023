package homework_20.Varsik_Pijoyan.BoundedBlockingBuffer;

public class BoundedBlockingBuffer<T> {
    T data;

    boolean valueSet = false;


    public synchronized void put(T data){
      while (valueSet){
          try {
              wait();
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
      }
        System.out.println(Thread.currentThread().getName() + "data put: " + data);
        this.data = data;
        valueSet = true;
        notifyAll();

    }

    public synchronized T take(){
        while (!valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + "data take: " + data);
        valueSet = false;
        notifyAll();
        return data;
    }

}

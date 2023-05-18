package homework_20.Alina_Mkhoyan;


public class Producer<T> implements Runnable {
    private BoundedBlockingBuffer buffer;

    public Producer(BoundedBlockingBuffer buffer) {
        this.buffer = buffer;
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        Integer i = 1;
        while (true) {
            buffer.put(i++);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

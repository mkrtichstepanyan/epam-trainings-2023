package homework_20.Varsik_Pijoyan.BoundedBlockingBuffer;

public class Consumer implements Runnable {

    Thread thread;
    private BoundedBlockingBuffer blockingBuffer;


    public Consumer(BoundedBlockingBuffer buffer) {
        blockingBuffer = buffer;
        thread = new Thread(this, "Consumer");
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            blockingBuffer.take();
        }
    }
}

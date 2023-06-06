package homework_20.Varsik_Pijoyan.BoundedBlockingBuffer;

public class Producer implements Runnable{

    Thread thread;
    private BoundedBlockingBuffer blockingBuffer;

    public Producer(BoundedBlockingBuffer buffer){
        blockingBuffer = buffer;
        thread = new Thread(this, "Producer");
    }

    @Override
    public void run() {
        int n = 0;
        while (true){
            blockingBuffer.put(n++);
        }
    }
}

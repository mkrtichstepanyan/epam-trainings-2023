package homework_20.Varsik_Pijoyan.BoundedBlockingBuffer;

public class Main {

    public static void main(String[] args) {
        BoundedBlockingBuffer<Integer> blockingBuffer = new BoundedBlockingBuffer<>();
        Consumer consumer = new Consumer(blockingBuffer);
        Producer producer = new Producer(blockingBuffer);

        consumer.thread.start();
        producer.thread.start();
    }
}

package homework_20.Nona_Asatryan;

public class BoundedBlockingBufferDemo {
    public static void main(String[] args) throws InterruptedException {
        BoundedBlockingBuffer<String> buffer = new BoundedBlockingBuffer<>();

        Thread producer = new Thread(new Producer<>(buffer));
        Thread consumer = new Thread(new Consumer<>(buffer));

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}

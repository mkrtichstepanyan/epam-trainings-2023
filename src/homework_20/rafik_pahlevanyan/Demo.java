package homework_20.rafik_pahlevanyan;

public class Demo {
    public static void main(String[] args) {

        BoundedBlockingBuffer<Object> bf = new BoundedBlockingBuffer<>(5);
        Consumer consumer = new Consumer(bf);
        Producer producer = new Producer(bf);

        producer.start();
        consumer.start();
    }
}



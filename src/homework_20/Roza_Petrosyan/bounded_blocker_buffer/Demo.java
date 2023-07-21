package homework_20.Roza_Petrosyan.bounded_blocker_buffer;

public class Demo {
    public static void main(String[] args) {
        BoundedBuffer<Integer> buffer = new BoundedBuffer<>();

        Producer<Integer> producer = new Producer<>(buffer);
        Consumer<Integer> consumer = new Consumer<>(buffer);

        producer.thread.start();
        consumer.thread.start();
    }
}

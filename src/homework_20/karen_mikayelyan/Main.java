package homework_20.karen_mikayelyan;

public class Main {
    public static void main(String[] args) {
        BoundedBuffer<Integer> buffer = new BoundedBuffer<>();

        Producer<Integer> producer = new Producer<>(buffer);
        Consumer<Integer> consumer = new Consumer<>(buffer);

        producer.thread.start();
        consumer.thread.start();
    }
}

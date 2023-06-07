package homework_20.anna_manukyan;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BoundedBlockingBuffer<Integer> boundedBlockingBuffer = new BoundedBlockingBuffer<>();

        Thread producer = new Thread(new Producer<>(boundedBlockingBuffer));
        Thread consumer = new Thread(new Consumer<>(boundedBlockingBuffer));

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
        System.out.println("Main thread was ended.");
    }
}

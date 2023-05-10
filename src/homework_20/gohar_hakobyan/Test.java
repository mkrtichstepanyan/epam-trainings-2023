package homework_20.gohar_hakobyan;

public class Test {
    public static void main(String[] args) {
        BlockingBuffer<Integer> buffer = new BlockingBuffer<>();

        Thread producer = new Thread(new Producer(buffer));
        Thread consumer = new Thread(new Consumer(buffer));

        producer.start();
        consumer.start();
    }
}

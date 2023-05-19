package homework_20.Ani_Barseghyan;

public class BoundedBlockingBufferDemo {
    public static void main(String[] args) throws InterruptedException {
        BoundedBlockBuffer<Integer> boundedBlockBuffer = new BoundedBlockBuffer<>();

        Thread consumer = new Thread(new Consumer<Integer>(boundedBlockBuffer));
        Thread producer = new Thread(new Producer(boundedBlockBuffer));

        consumer.start();
        producer.start();


    }
}


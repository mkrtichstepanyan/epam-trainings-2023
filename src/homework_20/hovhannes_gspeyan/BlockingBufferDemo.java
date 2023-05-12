package homework_20.hovhannes_gspeyan;

public class BlockingBufferDemo {

    public static void main(String[] args) {
        BoundedBlockingBuffer<Integer> buffer = new BoundedBlockingBuffer<>();
        Thread th1 = new Thread(new Supplier<>(buffer));
        Thread th2 = new Thread(new Customer<>(buffer));

        th1.start();
        th2.start();
    }
}

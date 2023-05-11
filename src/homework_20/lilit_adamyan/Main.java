package homework_20.lilit_adamyan;

public class Main {
    public static void main(String[] args) {

        BoundedBlockingBuffer<Integer> buffer = new BoundedBlockingBuffer<>(5);

        //Producer thread
        Thread producerThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    buffer.put(i);
                    System.out.println("Producer: " + i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        //Consumer thread
        Thread consumerThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    int value = buffer.get();
                    System.out.println("Consumed: " + value);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        producerThread.start();
        consumerThread.start();

    }
}
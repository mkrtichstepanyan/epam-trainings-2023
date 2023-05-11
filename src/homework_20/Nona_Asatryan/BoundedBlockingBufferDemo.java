package homework_20.Nona_Asatryan;

public class BoundedBlockingBufferDemo {
    public static void main(String[] args) {
        BoundedBlockingBuffer<String> buffer = new BoundedBlockingBuffer<>(1);

        Thread producer = new Thread(() -> {
            try {
                buffer.put("hello");
                System.out.println("Producer: put 'hello'");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                String result = buffer.take();
                System.out.println("Consumer: got '" + result + "'");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

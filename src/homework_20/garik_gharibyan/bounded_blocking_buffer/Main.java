package homework_20.garik_gharibyan.bounded_blocking_buffer;

public class Main {
    public static void main(String[] args) {
        Buffer<Integer> buffer = new Buffer<>();


        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                buffer.put(i);
            }
        }, "Consumer");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                buffer.take();
            }
        },"Producer");


        t1.start();
        t2.start();

    }
}


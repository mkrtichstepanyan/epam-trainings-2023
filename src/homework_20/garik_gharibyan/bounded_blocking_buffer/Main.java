package homework_20.garik_gharibyan.bounded_blocking_buffer;

public class Main {
    public static void main(String[] args) {
        Buffer<Integer> buffer = new Buffer<>();

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    buffer.put(i);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    buffer.take();
                }
            }
        });


        t1.start();
        t2.start();

    }
}


package homework_20.Ani_Barseghyan;

public class Consumer<T> implements Runnable {
    BoundedBlockBuffer buffer;
    T data;

    public Consumer(BoundedBlockBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
                for (int i = 0; i < 7; i++) {
                    buffer.get();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


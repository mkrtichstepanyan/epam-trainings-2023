package homework_20.Ani_Barseghyan;


public class Producer implements Runnable {
    BoundedBlockBuffer buffer;

    public Producer(BoundedBlockBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                for (int i = 0; i < 7; i++) {
                    buffer.put(i);
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

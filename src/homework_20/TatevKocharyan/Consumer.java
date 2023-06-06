package homework_20.TatevKocharyan;

import homework_20.TatevKocharyan.chapter11.Q;

public class Consumer<T> implements Runnable {
    BoundedBlockingBuffer<T> boundedBlockingBuffer;
    Thread t;

    public Consumer(BoundedBlockingBuffer<T> boundedBlockingBuffer) {
        this.boundedBlockingBuffer = boundedBlockingBuffer;
        this.t = new Thread(this, "Consumer");
    }

    @Override
    public void run() {

            boundedBlockingBuffer.take();
    }
}

package homework_20.Alina_Mkhoyan;

class Consumer<T> implements Runnable {
    private BoundedBlockingBuffer<T> buffer;

    public Consumer(BoundedBlockingBuffer buffer) {
        this.buffer = buffer;
        Thread t=new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            buffer.take();
        }
    }
}

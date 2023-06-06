package homework_20.araksya_ghazaryan;

public class Consumer implements Runnable{
    BoundedBlockBuffer buffer;

    public Consumer(BoundedBlockBuffer buffer ){
        this.buffer=buffer;
        Thread t=new Thread(this, "Consumer");
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
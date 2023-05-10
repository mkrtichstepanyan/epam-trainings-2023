package homework_20.aram_mehrabyan;

public class Consumer implements Runnable{
    BoundedBlockingBuffer buffer;

    Consumer(BoundedBlockingBuffer buffer){
        this.buffer=buffer;

    }
    @Override
    public void run(){
        while(true){
            buffer.take();
        }

    }
}

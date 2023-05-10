package homework_20.aram_mehrabyan;

public class Producer implements Runnable {
    BoundedBlockingBuffer buffer;

    Producer(BoundedBlockingBuffer buffer){
        this.buffer=buffer;

    }
    @Override
    public void run(){
        Integer data=0;
        while(true){
            buffer.put(data++);
        }

    }
}

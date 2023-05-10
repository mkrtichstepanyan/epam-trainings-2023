package homework_20.aram_mehrabyan;

public class Producer implements Runnable {
    BoundedBlockingBuffer buffer;

    Producer(BoundedBlockingBuffer buffer){
        this.buffer=buffer;

    }
    @Override
    public void run(){
        String data="Value";
        while(true){
            buffer.put(data);
        }

    }
}

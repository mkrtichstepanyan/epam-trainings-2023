package homework_20.aram_mehrabyan;

public class Producer implements Runnable {
    BoundedBlockingBuffer buffer;

    Producer(BoundedBlockingBuffer buffer){
        this.buffer=buffer;

    }
    @Override
    public void run(){

        while(true){
            for(int i=0;i<10;i++){
                buffer.put(i);
            }

        }

    }
}

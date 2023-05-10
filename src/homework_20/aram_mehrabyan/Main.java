package homework_20.aram_mehrabyan;

public class Main {
    public static void main(String[] args) {
        BoundedBlockingBuffer buffer=new BoundedBlockingBuffer();
        Thread t1=new Thread(new Producer(buffer));
        Thread t2=new Thread(new Consumer(buffer));
        t1.start();
        t2.start();
    }
    
}

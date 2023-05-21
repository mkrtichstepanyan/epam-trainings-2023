package homework_20.zara_avetyan;

public class Main {
    public static void main(String[] args) {
        BoundedBlockingBuffer buffer = new BoundedBlockingBuffer();
        Thread put = new Thread(new Producer(buffer));
        Thread pick = new Thread(new Consumer(buffer));

        put.start();
        pick.start();
    }
}
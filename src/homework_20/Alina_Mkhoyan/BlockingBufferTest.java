package homework_20.Alina_Mkhoyan;

public class BlockingBufferTest {
    public static void main(String[] args) throws InterruptedException {

        BoundedBlockingBuffer buffer = new BoundedBlockingBuffer();
      Producer t1 = new Producer(buffer);
      Consumer t2 = new Consumer(buffer);

    }
}

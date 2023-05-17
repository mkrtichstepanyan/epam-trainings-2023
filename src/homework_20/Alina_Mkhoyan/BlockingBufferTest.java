package homework_20.Alina_Mkhoyan;

import homework_20.araksya_ghazaryan.BoundedBlockBuffer;
import homework_20.araksya_ghazaryan.Consumer;
import homework_20.araksya_ghazaryan.Producer;

public class BlockingBufferTest {
    public static void main(String[] args) throws InterruptedException {

        BoundedBlockBuffer buffer = new BoundedBlockBuffer();
      Producer t1 = new Producer(buffer);
      Consumer t2 = new Consumer(buffer);

    }
}

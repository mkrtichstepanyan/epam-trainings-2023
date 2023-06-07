package homework_20.TatevKocharyan;

import homework_4.Roza_Petrosyan.task.C;

public class Test {
    public static void main(String[] args) {
        BoundedBlockingBuffer<String> names=new BoundedBlockingBuffer<>();
        Producer producer=new Producer(names,"Poxos");
        Consumer consumer=new Consumer(names);
        producer.t.start();
        consumer.t.start();
    }
}

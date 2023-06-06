package homework_20.garik_gharibyan.chapter_11.pc_fixed;

public class PCFixed {
    public static void main(String[] args) {
        Q q = new Q();
        Consumer consumer = new Consumer(q);
        Producer producer = new Producer(q);

        consumer.t.start();
        producer.t.start();

    }
}

package homework_20.Roza_Petrosyan.chapter_11.wrong_producer_and_consumer;

public class PC {
    public static void main(String[] args) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        p.t.start();
        c.t.start();
        System.out.println("Press Control_C to stop");
    }
}

package homework_20.Roza_Petrosyan.chapter_11.wrong_producer_and_consumer;

public class Producer implements Runnable{
    Q q;
    Thread t;

    Producer(Q q) {
        this.q = q;
        t = new Thread(this, "Producer");
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

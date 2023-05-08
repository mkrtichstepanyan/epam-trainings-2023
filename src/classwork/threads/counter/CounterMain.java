package classwork.threads.counter;

public class CounterMain {
    public static void main(String[] args) throws InterruptedException {


        Counter counter = new Counter();

        Thread t1 = new Thread(new Incrementer(counter));
        Thread t2 = new Thread(new Decrementer(counter));

        t1.start();
        t2.start();


        t1.join();
        t2.join();

    }
}

class Incrementer implements Runnable {

    private final Counter counter;
    Incrementer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            counter.increment();
        }
    }
}

class Decrementer implements Runnable {

    private final Counter counter;

    Decrementer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            counter.decrement();
        }
    }
}

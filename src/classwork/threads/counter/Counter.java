package classwork.threads.counter;

public class Counter {

    private static int count = 0;

    public static synchronized void increment() {
        count++;
    }

    public static synchronized void decrement() {
        count--;
    }

    public static void nonSyncMethod() throws InterruptedException {
        System.out.println("In non synchronized method");
        while (true) {
            Thread.sleep(10);
            System.out.println(Thread.currentThread().getState());
        }
    }

    public int getCount() {
        return count;
    }
}

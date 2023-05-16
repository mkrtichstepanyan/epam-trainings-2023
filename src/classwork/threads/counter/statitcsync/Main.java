package classwork.threads.counter.statitcsync;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        StaticSync staticSync = new StaticSync();
        Thread t1 = new Thread(() -> {
            try {
                StaticSync.method();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            staticSync.method2();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();


    }
}


class StaticSync {


   static synchronized void method() throws InterruptedException {
        System.out.println("Starting method.");
        Thread.sleep(10000);
        System.out.println("Finishing method.");
    }

    static void method2 () {
        System.out.println("In method 2");
    }

}

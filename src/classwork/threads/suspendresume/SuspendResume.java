package classwork.threads.suspendresume;

public class SuspendResume {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
        });

        t.start();


    }
}

class MyThread implements Runnable {
    boolean isSuspended = false;
    Thread t;

    MyThread() {
        t = new Thread(this, "My thread");
    }

    @Override
    public void run() {
        System.out.println("Login in run method!");
    }

    synchronized void pause() {
        while (!isSuspended) {
            try {
                wait();
                isSuspended = true;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("The thread is paused");
    }

    synchronized void play() {
        while (isSuspended) {
            notify();
            isSuspended = false;
        }
        System.out.println("The thread is paused");
    }
}

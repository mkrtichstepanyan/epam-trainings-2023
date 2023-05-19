package homework_20.garik_gharibyan.chapter_11;

public class ExtendThread {
    public static void main(String[] args) {
        NewThread1 nt = new NewThread1();
        nt.start();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main thread exiting");

    }
}

class NewThread1 extends Thread {

    NewThread1() {
        super("Demo Thread");
        System.out.println("Child thread: " + this);
    }

    @Override
    public void run() {

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Exiting child thread");

    }
}

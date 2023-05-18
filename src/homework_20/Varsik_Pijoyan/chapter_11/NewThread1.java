package homework_20.Varsik_Pijoyan.chapter_11;

public class NewThread1 extends Thread {

    NewThread1() {
        //Create a new, second thread
        super("Demo Thread");
        System.out.println("Child thread" + this);
    }

    //This is the entry point for the second thread


    @Override
    public void run() {
        try {
            for (int i = 5; i < 0; i--) {
                System.out.println("Child thread " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted");
        }
        System.out.println("Exiting child thread");
    }
}

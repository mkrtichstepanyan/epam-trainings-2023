package homework_20.Varsik_Pijoyan.chapter_11;

//Creating a second thread
public class NewThread implements Runnable {

    Thread t;

    NewThread() {
        //Create a new, second thread
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread " + t);
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

    }
}


package homework_20.qnarik_khachatryan.chapter_11;

//Create a second thread

class NewThread implements Runnable {
    Thread t;

    NewThread() {
        //Create a new, second thread
        t = new Thread(this, "DemoThread");
        System.out.println("Child thread: " + t);
    }

    //This is the entry point for the second thread.
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread");
    }
}


public class ThreadDemo {
    public static void main(String[] args) {
        NewThread nt = new NewThread(); //create a new thread

        nt.t.start(); //start the thread

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting");
    }
}

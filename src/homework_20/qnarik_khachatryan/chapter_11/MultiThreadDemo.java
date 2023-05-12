package homework_20.qnarik_khachatryan.chapter_11;

//Create multiple threads.
class NewThread2 implements Runnable {
    String name; //name of thread
    Thread t;

    NewThread2(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
    }

    //This is the entry point for thread.
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting.");
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        NewThread2 nt1 = new NewThread2("One");
        NewThread2 nt2 = new NewThread2("Two");
        NewThread2 nt3 = new NewThread2("Three");

        //start the threads
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        try {
            //wait for other threads to end
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting");
    }
}

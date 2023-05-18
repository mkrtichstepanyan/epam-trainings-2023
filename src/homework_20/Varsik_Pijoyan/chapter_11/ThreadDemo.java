package homework_20.Varsik_Pijoyan.chapter_11;

public class ThreadDemo {

    public static void main(String[] args) {
        NewThread nt = new NewThread();

        nt.t.start(); //Start the thread


        try {
            for (int i = 5; i < 0; i--) {
                System.out.println("Main thread " + i);
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}


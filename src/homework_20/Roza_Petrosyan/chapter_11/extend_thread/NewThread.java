package homework_20.Roza_Petrosyan.chapter_11.extend_thread;

public class NewThread extends Thread{
    NewThread(){
        super("Demo Thread");
        System.out.println("Child thread: " + this);
    }

    public void run() {
        try{
            for (int i = 5; i > 0 ; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted");
        }
        System.out.println("Exiting child thread.");
    }

}

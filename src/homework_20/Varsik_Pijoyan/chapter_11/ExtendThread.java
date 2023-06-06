package homework_20.Varsik_Pijoyan.chapter_11;

public class ExtendThread {

    public static void main(String[] args) {
        NewThread1 nt = new NewThread1();

        nt.start(); //start the thread

        try {
            for (int i = 5; i < 0; i--) {
                System.out.println("Main thread " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}

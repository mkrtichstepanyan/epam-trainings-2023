package homework_20.Varsik_Pijoyan.chapter_11;

//Using join() to wait for threads to finish
public class NewThread3 implements Runnable {

    String name;
    Thread t;

    NewThread3(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New Thread " + t);
    }
    @Override
    public void run() {
        try {
            for (int i = 5; i < 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println(name + " " + "interrupted");
        }
        System.out.println(name + " " + "exiting");
    }
}

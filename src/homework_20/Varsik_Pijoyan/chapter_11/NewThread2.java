package homework_20.Varsik_Pijoyan.chapter_11;

public class NewThread2 implements Runnable{
    String name; //name of the thread
    Thread t;

    NewThread2(String threadName){
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread " + t);
    }

    //This is the entry pint for thread
    @Override
    public void run() {
        try {
            for (int i = 5; i < 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println(name + " " + "Interrupted");
        }
        System.out.println(name + " " + "Exiting");
    }
}

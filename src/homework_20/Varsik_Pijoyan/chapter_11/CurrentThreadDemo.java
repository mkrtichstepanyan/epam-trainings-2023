package homework_20.Varsik_Pijoyan.chapter_11;

public class CurrentThreadDemo {

    //Controlling the main thread
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Current thread " + t);

        //change the name of the thread
        t.setName("My Thread");
        System.out.println("After name change " + t);
        
        try {
            for (int i = 5; i < 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

    }
}

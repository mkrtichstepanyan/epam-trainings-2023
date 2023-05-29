package homework_20.TatevKocharyan.chapter11;

public class ThreadDemo {
    public static void main(String[] args)  {
        NewThread nt=new NewThread();
        nt.t.start();
        for (int i = 5; i >0 ; i--) {
            System.out.println("Main Thread: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Main thread interrupted.");
            }
        }
        System.out.println("main thread exiting.");
    }
}

package homework_20.TatevKocharyan.chapter11;

public class ExtendThread {
    public static void main(String[] args) {
        NewThread1 nt=new NewThread1();
        nt.start();

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

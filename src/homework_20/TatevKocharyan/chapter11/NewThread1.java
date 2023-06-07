package homework_20.TatevKocharyan.chapter11;

public class NewThread1 extends Thread{
    NewThread1(){
       super("Demo Thread");
        System.out.println("Child thread: "+this);
    }

    @Override
    public void run() {
        for (int i = 5; i >0 ; i--) {
            System.out.println("child Thread: "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.err.println("Child interrupted.");
            }

        }
        System.out.println("Exiting child thread.");
    }



}

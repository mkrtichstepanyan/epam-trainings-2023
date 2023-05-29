package homework_20.TatevKocharyan.chapter11;

public class NewThread implements Runnable{
    Thread t;
    NewThread(){
        t=new Thread(this,"Demo Thread");
        System.out.println("Child thread: "+t);
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

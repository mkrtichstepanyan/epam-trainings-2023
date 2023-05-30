package homework_20.TatevKocharyan.chapter11;

public class NewThread2 implements Runnable{


    String name;
    Thread t;

    public NewThread2(String name) {
        this.name = name;
        this.t = new Thread(this,name);
        System.out.println("New thread: "+t);
    }

    @Override
    public void run() {
        for (int i = 5; i >0 ; i--) {
            System.out.println(name+": "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(name+"interrupted");
            }
        }
        System.out.println(name+"exiting.");
    }
}

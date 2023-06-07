package homework_20.TatevKocharyan.chapter11;

public class MultiThreadDemo {
    public static void main(String[] args) {
        NewThread2 nt1=new NewThread2("One");
        NewThread2 nt2=new NewThread2("Two");
        NewThread2 nt3=new NewThread2("Three");

        nt1.t.start();
        nt2.t.start();
        nt3.t.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main interrupted");
        }

        System.out.println("Main exiting");
    }
}

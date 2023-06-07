package homework_20.TatevKocharyan.chapter11;

public class Synch {
    public static void main(String[] args) {
        Callme target=new Callme();
        Caller ob1=new Caller("Hello",target);
        Caller ob2=new Caller("Synchronized",target);
        Caller ob3=new Caller("World",target);
        ob1.t.start();
        ob2.t.start();
        ob3.t.start();


        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }

    }
}

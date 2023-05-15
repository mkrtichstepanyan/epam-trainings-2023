package homework_20.garik_gharibyan.chapter_11;

class CallMe{
    synchronized void call(String msg){
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("]");
    }

}

class Caller implements Runnable{
    CallMe target;
    Thread t;
    String msg;

    Caller(CallMe target,String msg){
        this.target = target;
        this.msg = msg;
        t = new Thread(this);
    }

    @Override
    public void run() {
        target.call(msg);
    }
}
public class Synch {
    public static void main(String[] args) {
        CallMe callMe = new CallMe();

        Caller ob1 = new Caller(callMe,"Hello");
        Caller ob2 = new Caller(callMe,"Synchronized");
        Caller ob3 = new Caller(callMe,"World");

        ob1.t.start();
        ob2.t.start();
        ob3.t.start();

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

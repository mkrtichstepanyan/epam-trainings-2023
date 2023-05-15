package homework_20.garik_gharibyan.chapter_11;

class CallMe1{
    void call(String msg){
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("]");
    }

}

class Caller1 implements Runnable{
    final CallMe1 target;
    Thread t;
    String msg;

    Caller1(CallMe1 target,String msg){
        this.target = target;
        this.msg = msg;
        t = new Thread(this);
    }

    @Override
    public void run() {
        synchronized (target){
            target.call(msg);
        }
    }
}
public class Synch1 {
    public static void main(String[] args) {
        CallMe1 callMe = new CallMe1();

        Caller1 ob1 = new Caller1(callMe,"Hello");
        Caller1 ob2 = new Caller1(callMe,"Synchronized");
        Caller1 ob3 = new Caller1(callMe,"World");

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

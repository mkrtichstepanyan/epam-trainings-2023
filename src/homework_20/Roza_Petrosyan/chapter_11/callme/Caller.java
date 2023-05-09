package homework_20.Roza_Petrosyan.chapter_11.callme;

public class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
    }

    @Override
    public void run() {
        target.call(msg);
    }
}

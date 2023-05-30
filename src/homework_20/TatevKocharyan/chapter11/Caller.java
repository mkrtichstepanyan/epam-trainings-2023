package homework_20.TatevKocharyan.chapter11;

public class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;

    public Caller(String msg, Callme target) {
        this.msg = msg;
        this.target = target;
        this.t = new Thread(this);
    }

    @Override
    public void run() {
        target.call(msg);
    }
}

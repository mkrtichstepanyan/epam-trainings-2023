package homework_20.TatevKocharyan.chapter11;

public class Consumer implements Runnable {
    Q q;
    Thread t;

    public Consumer(Q q) {
        this.q = q;
        this.t = new Thread( this,"Consumer");
    }

    @Override
    public void run() {
        while (true){
            q.get();
        }
    }
}

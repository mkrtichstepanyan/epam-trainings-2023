package homework_20.TatevKocharyan.chapter11;

public class Producer implements Runnable {

    Q q;
    Thread t;

    public Producer(Q q) {
        this.q = q;
        this.t = new Thread(this, "Producer");
    }

    @Override

    public void run() {
        int i = 0;
        while (i!=10){
            q.put(i++);
        }
    }
}

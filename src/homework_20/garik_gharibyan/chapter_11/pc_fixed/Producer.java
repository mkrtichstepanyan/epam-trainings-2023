package homework_20.garik_gharibyan.chapter_11.pc_fixed;

public class Producer implements Runnable {
    Q q;
    Thread t;

    Producer(Q q){
        this.q = q;
        t = new Thread(this,"Producer");

    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            q.put(i);
        }
    }
}

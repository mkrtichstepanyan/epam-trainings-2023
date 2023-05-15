package homework_20.garik_gharibyan.chapter_11.pc_fixed;

public class Consumer implements Runnable {
    Q q;

    Thread t;

    Consumer(Q q){
        this.q = q;
        t = new Thread(this,"Consumer");
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            q.get();
        }
    }
}

package homework_20.lilit_adamyan;

public class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptionException caught");
            }
        }
        valueSet = false;
        System.out.println("Got : " + n);
        notify();
        return n;
    }


    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptionException caught");
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Put : " + n);
        notify();
    }

}
class Producer implements Runnable{
    Q q;
    Thread t;

    public Producer(Q q) {
        this.q = q;
        t = new Thread(this,"Producer");
    }

    @Override
    public void run() {
        int i = 0;
         while (true){
             q.put(i++);
         }

    }
}
class Consumer implements Runnable{
    Q q;
    Thread t;

    public Consumer(Q q){
        this.q = q;
        t= new Thread(this,"Consumer");

    }

    @Override
    public void run() {
       while(true){
           q.get();
       }
    }
}

class PCFixed{
    public static void main(String[] args) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.t.start();
        c.t.start();

        System.out.println("Press Control_C to stop");



    }
}
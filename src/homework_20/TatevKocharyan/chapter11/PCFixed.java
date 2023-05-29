package homework_20.TatevKocharyan.chapter11;

public class PCFixed {
    public static void main(String[] args) {
        Q q=new Q();
        Producer p=new Producer(q);
        Consumer c=new Consumer(q);

        p.t.start();
        c.t.start();
    }
}

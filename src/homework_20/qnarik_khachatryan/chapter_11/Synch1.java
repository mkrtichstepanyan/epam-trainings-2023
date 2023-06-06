package homework_20.qnarik_khachatryan.chapter_11;

//This program uses a synchronized block

class CallMe1 {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

class Caller1 implements Runnable {
    String msg;
    CallMe1 target;
    Thread t;

    public Caller1(CallMe1 targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
    }

    //synchronize calls to call()
    public void run() {
        synchronized (target){ //synchronized block
            target.call(msg);
        }
    }
}

class Synch1 {
    public static void main(String[] args) {
        CallMe1 target = new CallMe1();

        Caller1 ob1 = new Caller1(target, "Hello");
        Caller1 ob2 = new Caller1(target, "Synchronized");
        Caller1 ob3 = new Caller1(target, "World");

        //start the threads
        ob1.t.start();
        ob2.t.start();
        ob3.t.start();

        //wait for threads to end
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

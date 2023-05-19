package classwork.threads.deadlock;
// cyclic dependency
public class A {

    synchronized void foo(B b) {
        String tName = Thread.currentThread().getName();
        System.out.println(tName + " entered A.foo()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("A interrupted!");
        }
        System.out.println(tName + " trying to call B.last()");
        // main thread tries to acquire b's monitor
        b.last();
    }

    synchronized void last() {
        System.out.println("In A.last().");
    }
}


class B {
    synchronized void bar(A a) {
        String tName = Thread.currentThread().getName();
        System.out.println(tName + " entered B.bar()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("B interrupted!");
        }
        System.out.println(tName + " trying to call A.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("In B.last().");
    }
}

class Deadlock implements Runnable {

    private A a = new A();
    private B b = new B();

    Thread t;

    Deadlock() {
        Thread.currentThread().setName("Main thread.");
        t = new Thread(this, "Racing thread");
    }

    void deadlockStart() {

        t.start();
        // in main thread - > // Main thread acquires A's monitor
        a.foo(b);
        System.out.println("Back in main thread.");
    }

    @Override
    public void run() {
        // starting new thread - racing thread acquires B's monitor
        b.bar(a);
        System.out.println("Back in other thread.");
    }

    public static void main(String[] args) {
        Deadlock deadlock = new Deadlock();

        deadlock.deadlockStart();
    }
}

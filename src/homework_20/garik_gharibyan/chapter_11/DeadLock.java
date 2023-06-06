package homework_20.garik_gharibyan.chapter_11;
class A{
    synchronized void foo(B b){
        System.out.println(Thread.currentThread().getName() + ": a.foo");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("call b.last");
        b.last();
    }
    synchronized void last(){
        System.out.println("inside a.last");
    }
}
class B{
    synchronized  void bar(A a){
        System.out.println(Thread.currentThread().getName() + ": b.bar");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("call a.last");
        a.last();
    }
    synchronized void last(){
        System.out.println("inside b.last");
    }

}
public class DeadLock implements Runnable{

    A a = new A();
    B b = new B();
    Thread t;

    DeadLock(){
        t = new Thread(this,"DeadLock");
    }
    @Override
    public void run() {
        b.bar(a);
    }
    void deadLockStart(){
        t.start();
        a.foo(b);
    }
    public static void main(String[] args) {
        DeadLock d = new DeadLock();
        d.deadLockStart();

    }


}

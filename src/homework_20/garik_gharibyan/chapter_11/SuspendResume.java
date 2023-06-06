package homework_20.garik_gharibyan.chapter_11;

class NewThread3 implements Runnable {

    String name;
    Thread t;
    boolean suspendFlag;

    NewThread3(String name) {
        this.name = name;
        t = new Thread(this, name);
        suspendFlag = false;
    }

    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this){
                    while (suspendFlag){
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(name + " exiting.");

    }

    synchronized void mySuspend(){
        suspendFlag = true;
    }

    synchronized void myResume(){
        suspendFlag = false;
        notifyAll();
    }
}

public class SuspendResume {
    public static void main(String[] args) {
        NewThread3 ob1 = new NewThread3("One");
        System.out.println("No Start: " + ob1.t.getState());

        ob1.t.start();

        try {
            Thread.sleep(1000);
            ob1.mySuspend();
            System.out.println("Suspending Thread One");
            Thread.sleep(1000);
            System.out.println("Resuming Thread One");
            ob1.myResume();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println("Waiting for Thread to finish");
            ob1.t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread exiting");
    }

}

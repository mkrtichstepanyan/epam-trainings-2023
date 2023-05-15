package homework_20.garik_gharibyan.chapter_11;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread2 t1 = new NewThread2("One");
        NewThread2 t2 = new NewThread2("Two");
        NewThread2 t3 = new NewThread2("Three");

        t1.t.start();
        t2.t.start();
        t3.t.start();

        System.out.println("Thread One isAlive: " + t1.t.isAlive());
        System.out.println("Thread Two isAlive: " + t2.t.isAlive());
        System.out.println("Thread Three isAlive: " + t3.t.isAlive());

        try {
            System.out.println("Waiting for treads to finish. ");
            t1.t.join();
            t2.t.join();
            t3.t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread One isAlive: " + t1.t.isAlive());
        System.out.println("Thread Two isAlive: " + t2.t.isAlive());
        System.out.println("Thread Three isAlive: " + t3.t.isAlive());

        System.out.println("Main Thread exiting.");
    }
}

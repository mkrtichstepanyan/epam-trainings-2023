package homework_20.Varsik_Pijoyan.chapter_11;

public class DemoJoin {

    public static void main(String[] args) {
        NewThread3 nt1 = new NewThread3("One");
        NewThread3 nt2 = new NewThread3("Two");
        NewThread3 nt3 = new NewThread3("Three");

        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        System.out.println("Thread one is alive: " + nt1.t.isAlive());
        System.out.println("Thread two is alive: " + nt2.t.isAlive());
        System.out.println("Thread three is alive: " + nt3.t.isAlive());

        //wait for threads to finish
        try {
            System.out.println("Waiting for threads to finish");
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
        }catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}

package homework_21.qnarik_khachatryan.chapter_29;

// a simple semaphore examole


import java.util.concurrent.Semaphore;

class SemDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);
        new Thread(new IncThread(sem, "A")).start();
        new Thread(new DecThread(sem, "B")).start();

    }
}

// A shared resource
class Shared {
    static int count = 0;
}

//A thread of execution that increments count.

class IncThread implements Runnable {

    String name;
    Semaphore sem;

    //The thread of execution that increments count
    IncThread(Semaphore s, String n) {
        sem = s;
        name = n;
    }

    @Override
    public void run() {
        System.out.println("Starting" + name);

        try {
            //get a permit
            System.out.println(name + " is waiting for a permit.");
            sem.acquire();
            System.out.println(name + "gets a permit");

            //access shared resource (доступ к общему ресурсу)
            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println(name + ":" + Shared.count);

                //now allow a context switch -- if possible
                Thread.sleep(10);
            }
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }

        //release the permit
        System.out.println(name + " release the permit.");
        sem.release();

    }
}

//The thread of execution that decrements count

class DecThread implements Runnable {

    String name;
    Semaphore sem;

    //The thread of execution that increments count
    DecThread(Semaphore s, String n) {
        sem = s;
        name = n;
    }

    @Override
    public void run() {
        System.out.println("Starting" + name);

        try {
            //get a permit
            System.out.println(name + " is waiting for a permit.");
            sem.acquire();
            System.out.println(name + "gets a permit");

            //access shared resource (доступ к общему ресурсу)
            for (int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println(name + ":" + Shared.count);

                //now allow a context switch -- if possible
                Thread.sleep(10);
            }
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }

        //release the permit
        System.out.println(name + " release the permit.");
        sem.release();

    }
}



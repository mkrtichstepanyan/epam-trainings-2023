package classwork.threads.concurrency;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWListExample {

    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> ints = new CopyOnWriteArrayList<>();


        ints.add("1");
        ints.add("123");
        ints.add("400");
        ints.add("600");
        ints.add("10");

        Thread t1 = new Thread(() -> {
            Iterator<String> iterator = ints.iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(300);
                    System.out.println(ints.remove(iterator.next()));

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ints.remove(3);
            System.out.println("In thread 2: ");
            System.out.println(ints);
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("In main thread");
        System.out.println(ints);
    }
}

package classwork.threads;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    // data transfer
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);

        scheduledExecutorService.scheduleAtFixedRate(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName());
        }, 0, 50, TimeUnit.MILLISECONDS);

        Thread.sleep(500);
        System.out.println("Shutdown called");

        List<Runnable> runnables = scheduledExecutorService.shutdownNow();
        for (Runnable runnable : runnables) {
            System.out.println("runnable instance");
        }
        scheduledExecutorService.awaitTermination(1000, TimeUnit.MILLISECONDS);
        Thread.sleep(10000);
    }
}

class User {
    String name;
    int age;

}

class Address {
    String region;
    String city;
    String street;
    String building;
    String apartmentNumber;
}

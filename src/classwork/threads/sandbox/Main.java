package classwork.threads.sandbox;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class Main {

    //6079400
    //7868600
    // sec run
    //6105400
    //7349800
    // third run with more elements
    //99910200
    //80625500
    // thread starvation
    public static void main(String[] args) {
        // Thread pool
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        for (int i = 0; i < 100; i++) {
//            executorService.submit(() -> System.out.println(Thread.currentThread().getName()));
//        }
        List<String> objects = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            objects.add(i + "");
        }
        long startTime = System.nanoTime();
        // fork-join pool
        objects.parallelStream().map(s -> s + "a").collect(Collectors.toList());
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }
}

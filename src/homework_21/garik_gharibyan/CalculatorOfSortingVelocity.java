package homework_21.garik_gharibyan;

import homework_21.garik_gharibyan.sort.*;

import java.util.ArrayList;

public class CalculatorOfSortingVelocity {
    public void calculateSpeed(int length, int attempts) {
        ArrayList<Integer> list = RandomList.create(length);
        System.out.println("Non sorted list: " + list + "\n");

        SelectionRunnable selectionRunnable = new SelectionRunnable(list, attempts);
        InsertionRunnable insertionRunnable = new InsertionRunnable(list,attempts);
        BubbleRunnable bubbleRunnable = new BubbleRunnable(list,attempts);
        MergeRunnable mergeRunnable = new MergeRunnable(list,attempts);

        Thread sThread = new Thread(selectionRunnable);
        Thread iThread = new Thread(insertionRunnable);
        Thread bThread = new Thread(bubbleRunnable);
        Thread mThread = new Thread(mergeRunnable);

        sThread.start();
        iThread.start();
        bThread.start();
        mThread.start();

        try {
            sThread.join();
            iThread.join();
            bThread.join();
            mThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        selectionRunnable.printInfo();
        insertionRunnable.printInfo();
        bubbleRunnable.printInfo();
        mergeRunnable.printInfo();

//        final ExecutorService executor = Executors.newFixedThreadPool(4);
//
//        executor.submit(selectionRunnable);
//        executor.submit(insertionRunnable);
//        executor.submit(bubbleRunnable);
//        executor.submit(mergeRunnable);
//
//        try {
//            if (executor.awaitTermination(2, TimeUnit.SECONDS)) {
//                System.out.println("task completed");
//            } else {
//                System.out.println("Forcing shutdown...");
//                executor.shutdownNow();
//            }
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

    }
}

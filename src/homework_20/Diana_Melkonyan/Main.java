package homework_20.Diana_Melkonyan;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BoundedBlockingBuffer queue = new BoundedBlockingBuffer();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Runnable task = queue.take();
                    task.run();
                }
            }
        });

        t.start();
        for (int i = 0; i < 10; i++) {
            queue.put(getTask());
        }
    }

    private static Runnable getTask() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("Start  :" + this);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Finish  :" + this);
            }
        };
    }

}

class BoundedBlockingBuffer {
    ArrayList<Runnable> tasks = new ArrayList<>();

    public synchronized Runnable take() {
        while (tasks.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Runnable task = tasks.get(0);
        tasks.remove(task);
        return task;
    }

    public synchronized void put(Runnable task) {
        tasks.add(task);
        notify();
    }
}

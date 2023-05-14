package homework_20.qnarik_khachatryan;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        BoundedBlockingBuffer<Integer> blockingBuffer = new BoundedBlockingBuffer();

        Thread t1 = new Thread(new Thread1(blockingBuffer));
        Thread t2 = new Thread(new Thread2(blockingBuffer));

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}


//потоковый объект, создающий записи в очереди
class Thread1 implements Runnable {

    BoundedBlockingBuffer<Integer> blockingBuffer = new BoundedBlockingBuffer();

    Thread1(BoundedBlockingBuffer blockingBuffer) {
        this.blockingBuffer = blockingBuffer;

    }

    @Override
    public void run() {
        for (int i = 0; i < 1_000; i++) {
            blockingBuffer.put(i);
        }
    }
}


//потоковый объект, забирающий записи из очереди
class Thread2 implements Runnable {
    BoundedBlockingBuffer<Integer> blockingBuffer = new BoundedBlockingBuffer();

    Thread2(BoundedBlockingBuffer blockingBuffer) {
        this.blockingBuffer = blockingBuffer;

    }

    //тут д.б. логика - что должен сделать поток
    @Override
    public void run() {
        for (int i = 0; i < 1_000; i++) {
            blockingBuffer.take();
        }
    }
}



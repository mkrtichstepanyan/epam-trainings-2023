package homework_20.Ani_Kovalenko.using_sinc_keyword;

public class Run {
    public static void main(String[] args) throws InterruptedException {

        BoundedBlockingBuffer buffer = new BoundedBlockingBuffer();

        Thread thread_1 = new Thread(new InputMaker(buffer));
        Thread thread_2 = new Thread(new ValueGetter(buffer));

        thread_1.start();
        Thread.sleep(1000);
        thread_2.start();
        Thread.sleep(10000);

        System.out.println("Status of the thread 1: " + thread_1.getState());
        System.out.println("Status of the thread 2: " + thread_2.getState());
//        try {
//            thread_1.join();
//            thread_2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}

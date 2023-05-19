package homework_20.garik_gharibyan.chapter_11;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();

        System.out.println("Current thread: " + thread.toString());
        thread.setName("My thread");
        System.out.println("After name change: " + thread);


            try {
                for (int i = 5; i > 0 ; i--) {
                    System.out.println(i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


    }
}

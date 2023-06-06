package homework_20.Ani_Kovalenko.using_sinc_keyword;

public class Run {
    public static void main(String[] args) throws InterruptedException {

        BoundedBlockingBuffer buffer = new BoundedBlockingBuffer();

        Thread inputMaker = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("The input value is " + i);
                buffer.put(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread valueGetter = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("The output is " + buffer.pick());
                System.out.println("-------------------------------");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        inputMaker.start();
        Thread.sleep(100);
        valueGetter.start();
        Thread.sleep(10000);

        System.out.println("Status of input maker thread is: " + inputMaker.getState());
        System.out.println("Status of value getter thread is: " + valueGetter.getState());
    }
}

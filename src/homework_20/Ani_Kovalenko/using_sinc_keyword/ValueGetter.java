package homework_20.Ani_Kovalenko.using_sinc_keyword;

public class ValueGetter implements Runnable {
    BoundedBlockingBuffer buffer;

    ValueGetter(BoundedBlockingBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.pick();
            System.out.println("after calling pick method");
        }
    }
}

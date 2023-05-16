package homework_20.Ani_Kovalenko.using_sinc_keyword;

class InputMaker implements Runnable {
    BoundedBlockingBuffer buffer;

    InputMaker(BoundedBlockingBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Input value: " + i);
            buffer.put(i);
            System.out.println("after calling put method");
        }
    }
}

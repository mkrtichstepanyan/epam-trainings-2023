package homework_20.Ani_Kovalenko.using_sinc_keyword;

public class BoundedBlockingBuffer {
    private int num = 10;
    private volatile boolean valueSet;


    public synchronized void put(int data) {
        System.out.println("put has been called");
        while (!valueSet) {
            try {
                wait();
                System.out.println("the put() method got over from waiting stage");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.num *= data;
            System.out.println("the put`  'after initialization : ' " + num);
            valueSet = true;

            notify();
            System.out.println("notify was called with put() method");
        }
    }

    public synchronized void pick() {
        System.out.println("pick has been called");
        while (valueSet) {
//            try {
//                wait();
//                System.out.println("the pick() method is on the waiting state");
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            valueSet = false;

        }
        notify();
            System.out.println("notify was called with pick() method");
        System.out.println(num);
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public int getNum() {
        return num;
    }
}

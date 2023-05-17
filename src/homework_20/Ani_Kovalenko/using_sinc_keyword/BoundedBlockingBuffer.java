package homework_20.Ani_Kovalenko.using_sinc_keyword;

public class BoundedBlockingBuffer {
    private int num = 1;
    private boolean valueSet;


    public synchronized void put(int data) {
        System.out.println("put has been called");
        if (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.num *= data;
        System.out.println("the put`  'after initialization ' : " + num);
        valueSet = true;
        notify();
    }

    public synchronized int pick() {
        System.out.print("pick has been called : ");
        if (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        valueSet = false;
        notify();
        return num;
    }

    public int getNum() {
        return num;
    }
}

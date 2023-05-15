package homework_20.garik_gharibyan.chapter_11.pc_fixed;

public class Q {
    int n;
    boolean valueSet = false;

    synchronized void put(int n) {
        while (valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notifyAll();
    }

    synchronized int get() {
        while (!valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Get: " + n);
        valueSet = false;
        notifyAll();
        return n;
    }
}

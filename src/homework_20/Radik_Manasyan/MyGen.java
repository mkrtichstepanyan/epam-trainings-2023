package homework_20.Radik_Manasyan;

public class MyGen<T> {
    private T value;
    private boolean flag = false;

    public MyGen(T value) {
        this.value = value;
    }

    public synchronized T take() {
        while (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Take " + value);
        flag = false;
        notify();
        return value;
    }

    public synchronized void put(T val) {
        while (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
        value = val;
        flag = true;
        System.out.println("Put " + val);
        notify();
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "MyGen{" +
                "value=" + value +
                ", flag=" + flag +
                '}';
    }
}

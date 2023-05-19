package classwork.threads.counter;

public class Counter {

    private double volInteger = 0;


    public void increment() {
        volInteger++;
    }

    public void decrement() {
        volInteger--;
    }

    public double getCount() {
        return volInteger;
    }
}

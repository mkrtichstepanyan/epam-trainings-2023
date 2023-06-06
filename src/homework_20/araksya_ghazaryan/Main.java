package homework_20.araksya_ghazaryan;

public class Main {
    public static void main(String[] args) {
        BoundedBlockBuffer buffer = new BoundedBlockBuffer();
        Producer t1 = new Producer(buffer);
        Consumer t2 = new Consumer(buffer);
    }
}
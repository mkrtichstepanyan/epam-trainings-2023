package homework_20.Argishti_Mesropyan;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BoundedBlockingBuffer<Integer> buffer = new BoundedBlockingBuffer<>(1);


        Thread product = new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                try {
                    buffer.put(i);
                    System.out.println("Product put " + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread costumer = new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                try {
                    int value = buffer.take();
                    System.out.println("Costumer took " + value);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        product.start();
        costumer.start();

        product.join();
        costumer.join();

    }
}

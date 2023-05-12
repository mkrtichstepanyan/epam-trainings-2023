package homework_20.garik_gharibyan.bounded_blocking_buffer;

class Buffer<T> {
    private T value;

    public synchronized void put(T value) {
        while (this.value != null) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        notifyAll();
        this.value = value;
        System.out.println(Thread.currentThread().getName() + " put value[" + value + "]");
    }

    public synchronized T take() {
        T newValue;

        while (this.value == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        notifyAll();
        newValue = value;
        value = null;
        System.out.println(Thread.currentThread().getName() + " take the value[" + newValue + "], buffer is: " + value);
        return newValue;
    }
}

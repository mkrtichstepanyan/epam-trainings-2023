package homework_8.garik_gharibyan.chapter_9.stack;

public interface IntStack {
    void pus(int item);

    int pop();

    default void clear() {
        System.out.println("clear() not implemented.");
    }

    default int[] popNElements(int n) {
        return getElements(n);
    }

    default int[] skipAndPopNElements(int skip, int n) {
        getElements(skip);
        return getElements(n);
    }

    private int[] getElements(int n) {
        int[] elements = new int[n];

        for (int i = 0; i < n; i++) {
            elements[i] = pop();
        }
        return elements;
    }
}

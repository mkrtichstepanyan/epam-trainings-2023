package homework_8.karen_mikayelyan.chapter_9;

public interface IntStack {
    void push(int item);

    int pop();

    default void clear() {
        System.out.println(" Clear() not implemented. ");
    }

    default int[] skipAndPopNElements(int skip, int n) {
        getElements(skip);
        return getElements(n);
    }

    default int[] popNElements(int n) {
        return getElements(n);
    }

    default int[] getElements(int n) { //private
        int[] elements = new int[n];
        for (int i = 0; i < n; i++) {
            elements[i] = pop();
        }
        return elements;
    }
}

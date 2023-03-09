package homework_8.Sofya_Ghazaryan;

interface IntStack {
    void push(int item);

    int pop();


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

    default void clear() {
        System.out.println("clear() not implemented.");
    }
}
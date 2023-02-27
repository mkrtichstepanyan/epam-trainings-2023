package homework_7.Lilit_Adamyan.chapter_9.private_method;

public interface IntStack {
    void push(int item);

    int pop();

    default int[] popElements(int n) {
        return getElements(n);
    }

    default int[]skipAndPopElements(int skip,int n){
        getElements(skip);
        return getElements(n);
    }

    private int[] getElements(int n) {

        int[] elements = new int[n];
        for (int i = 0; i < n; i++) {
            elements[i] = pop();

        }return elements;
    }
}

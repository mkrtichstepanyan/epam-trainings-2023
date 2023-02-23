package homework_8.rafik_pahlevanyan.chapter_9;

//Define an integer stack interface.
interface IntStack {
    void push(int item);    //int item

    int pop();  //retrieve an item

    /*
        A.java default method that returns an array that contains
        the top n elements on the stack
     */
    default int[] popNElements(int n) {
        //return the requested elements
        return getElements(n);
    }

    /*
        A.java default method that returns an array that contains
        the next n elements on the stack after skipping elements.
     */
    default int[] skipAndPopNElements(int skip, int n) {
        //skip the specified number of elements.
        getElements(skip);
        //return the requested elements
        return getElements(n);
    }

    /*
        A.java private method that returns an array containing
        the top n elements on the stack
     */
    private int[] getElements(int n) {
        int[] elements = new int[n];
        for (int i = 0; i < n; i++) {
            elements[i] = pop();
        }
        return elements;
    }

    /*
        Because clear() has a default, it need not be
        implemented by a preexisting class that uses IntStack
     */
    default void clear() {
        System.out.println("clear() not implemented.");
    }
}
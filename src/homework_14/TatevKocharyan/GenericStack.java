package homework_14.TatevKocharyan;

public class GenericStack<T> {
    private T[] stck;
    private int tos;

//GenericStack(<T> clazz,int size){
// stck = (T[]) Array.newInstance(clazz, size);}

    GenericStack(int size) {
        stck = (T[]) new Object[size];

        tos = -1;
    }

    public void push(T item) {
        if (tos == stck.length / 4 * 3) {
            extendCapacity();
        }
        stck[++tos] = item;
    }


    public T pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return null;
        } else {
            return stck[tos--];
        }
    }


    private void extendCapacity() {
        T[] newArray = (T[]) new Object[stck.length * 2];
        for (int i = 0; i < stck.length; i++) {
            newArray[i] = stck[i];
        }
        stck = newArray;

    }

    public void print() {
        for (int i = 0; i < stck.length; i++) {
            if (stck[i] == null) {
                continue;
            } else {
                System.out.print(stck[i] + " ");
            }
        }
    }

}

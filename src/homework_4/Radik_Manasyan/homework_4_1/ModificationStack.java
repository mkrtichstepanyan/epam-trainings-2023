package homework_4.Radik_Manasyan.homework_4_1;

public class ModificationStack {
    private int length = 10;
    private int[] array = new int[length];
    private int size = -1;

    public ModificationStack() {

    }

    public ModificationStack(int arraySize) {
        this.length = arraySize;
    }

    public void push(int element) {
        if (size == length - 1) {
            System.out.println("The stack is already full!");
        } else {
            array[++size] = element;
            if (size >= length * 75 / 100) {
                refactor();
            }
        }
    }

    public Integer pop() {
        if (size <= -1) {
            System.out.print("The stack is empty! ");
            return null;
        } else {
            return array[size--];
        }
    }

    private void refactor() {
        int[] temp = new int[length * 2];
        if (size + 1 >= 0) System.arraycopy(array, 0, temp, 0, size + 1);
        array = temp;
        length = temp.length;
    }
}

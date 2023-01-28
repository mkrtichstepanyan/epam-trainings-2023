package homework_4.Diana_Melkonyan.stack;

public class Stack {
   private int[] array;
   private int index;

    Stack() {
        array = new int[2];
        index = -1;
    }

    public Stack(int size) {

        array = new int[size];
        index = -1;

    }

   public void push(int item) {
        if (index >= (array.length * 75) / 100) {
            int[] newArr = new int[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArr[i] = array[i];
            }
            array = newArr;
        }
        array[++index] = item;
    }


    public int pop() {
        if (index < 0) {
            System.out.println("The stack is empty!");
            return 0;
        } else {

            int carentElement = array[index];
            array[index] = 0;
            index--;
            return carentElement;
        }
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}

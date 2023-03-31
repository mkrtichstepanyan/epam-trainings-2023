package homework_14.Qnarik_Khachatryan.generic_stack;

import java.util.Arrays;

public class GenericStack <T>{
    Object[] myStack;

    int sizeOfArr;
    int index = 0;


    //constructor for Stack
    GenericStack(int size) {
        sizeOfArr = size;
        myStack = new Object[sizeOfArr];
    }

    void push(T element) {
        if (index == sizeOfArr) {
            System.out.println("The stack is already full!");
        } else {
            myStack[index] = element;
            index++;
        }
    }

    T pop() {
        if (index == 0) {
            System.out.println("The stack is empty!");
            return null;
        } else {
            return (T)myStack[--index];
        }
    }
}

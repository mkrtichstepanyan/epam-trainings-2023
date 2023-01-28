package homework_4.Qnarik_Khachatryan.task_4.c;

import java.util.Arrays;

public class Stack {
    private int[] myStack;
    private int sizeOfArr;
    private int index = 0;
    private int countOfElem = 0;
    private int fullPercent = 0;


    //constructor for Stack
    Stack(int size) {
        sizeOfArr = size;
        myStack = new int[sizeOfArr];
    }


    //adds the given element onto a top of the stack
    public void push(int element) {
        myStack[index] = element;
        index++;
        countOfElem += 1;
        fullPercent = countOfElem * 100 / sizeOfArr;

        if (fullPercent >= 75) {
            extendCapacity(myStack);
        }
    }

    // returns an element from the top of the stack
    public int pop() {
        if (index == 0) {
            System.out.println("The stack is empty!");
            return 0;
        } else {
            return myStack[index - 1];
        }
    }


    //принимает массив, увеличивает размер в 2 раза и копирует данные со старого массива
    private void extendCapacity(int[] arr) {
        sizeOfArr = sizeOfArr * 2;
        myStack = Arrays.copyOf(arr, sizeOfArr);
    }
}

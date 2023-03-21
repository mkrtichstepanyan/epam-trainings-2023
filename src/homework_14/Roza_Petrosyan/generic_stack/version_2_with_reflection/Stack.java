package homework_14.Roza_Petrosyan.generic_stack.version_2_with_reflection;

import java.lang.reflect.Array;

public class Stack<T> {
    private int tos;
    private T[] stack;
    private Class<T> classType;


    public Stack(Class<T> classType) {
        this.classType = classType;
        stack = (T[]) Array.newInstance(classType, 10);
        tos = -1;
    }

    public Stack(Class<T> classType, int size) {
        this.classType = classType;
        stack = (T[]) Array.newInstance(classType, size);
        tos = -1;
    }

    public void push(T item) {
        if (tos > stack.length * 0.75) {
            extendCapacity();
        }
        stack[++tos] = item;
    }

    private void extendCapacity() {
        int double_size = stack.length * 2;
        T[] double_stack = (T[]) Array.newInstance(classType, double_size);
        System.arraycopy(stack, 0, double_stack, 0, stack.length);
        stack = double_stack;
    }

    public T pop() {
        if (tos == -1) {
            System.out.println("The stack is empty!");
            return null;
        } else {
            return stack[tos--];
        }
    }
}

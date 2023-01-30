package homework_4.Galust_Arzumanyan.homework_4_1;

public class Stack {
    private int[] stack;
    private int top;
    private int counter;
    private int size;


    public Stack(int stack_size) {
        this.top = -1;
        this.stack = new int[stack_size];
        this.size = stack_size;
    }

    private int[] my_stack_copy(int size) {
        int[] new_stack = new int[size];
        for (int i = 0; i < stack.length; i++) {
            new_stack[i] = stack[i];
        }
        return new_stack;
    }

    public void push(int item) {
        if (top == size) {
            System.out.println("The stack is already full");
        } else {
            stack[++top] = item;
            counter++;
            if (counter > (size - 1) * 75 / 100) {
                stack = my_stack_copy(size * 2);
            }
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("The stack is empty");
            return 0;
        } else {
            return stack[top--];
        }
    }


}


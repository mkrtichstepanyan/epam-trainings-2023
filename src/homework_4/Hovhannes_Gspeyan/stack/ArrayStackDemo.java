package homework_4.Hovhannes_Gspeyan.stack;

public class ArrayStackDemo {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        int value = 0;
        for (int i = 0; i < 40; i++) {
            stack.push(value++);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

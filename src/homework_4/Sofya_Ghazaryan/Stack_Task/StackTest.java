package homework_4.Sofya_Ghazaryan.Stack_Task;

public class StackTest {

    public static void main(String[] args) {
        Stack stack = new Stack(10);

        for (int i = 0; i < 20; i++) {
            stack.push(i);
        }
        System.out.print("Stack: ");
        stack.printStack();

        for (int i = 0; i < 20; i++) {
            stack.pop();
            System.out.println("\nAfter " + i + " step popping out:");
            stack.printStack();
        }
    }
}

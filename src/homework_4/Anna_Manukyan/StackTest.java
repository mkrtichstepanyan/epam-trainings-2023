package homework_4.Anna_Manukyan;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 50; i < 60; i++) {
            stack.push(i);
        }
        stack.printStack();

        System.out.println();
        System.out.println("Popping out element from stack");

        stack.pop();
        stack.pop();
        stack.printStack();

        System.out.println();
        Stack stackRef = new Stack(3);
        for (int i = 0; i < 10; i++) {
            stackRef.pushRefactor(i);
        }
        stackRef.printStack();
    }
}

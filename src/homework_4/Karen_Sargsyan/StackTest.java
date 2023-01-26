package homework_4.Karen_Sargsyan;

public class StackTest {
    public static void main(String[] args) {
        DynamicStack myStack = new DynamicStack(10);

        for (int i = 0; i < 10; i++) {
            myStack.push(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(myStack.pop());
        }

        Stack myStack2 = new Stack();

        for (int i = 0; i < 10; i++) {
            myStack2.push(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(myStack2.pop());
        }
    }

}

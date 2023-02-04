package homework_4.Arsen_Kazaryan.Stack;

import homework_4.Arsen_Kazaryan.Stack.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i < 10; i++) {
stack.push(i);
stack.pop();
        }
    }
}